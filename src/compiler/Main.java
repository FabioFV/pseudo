package compiler;

import parser.PSEUDOLexer;
import parser.PSEUDOParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String args[]) throws Exception
    {
        ANTLRInputStream input = new ANTLRFileStream("input");
        createJavaFile(input);
        compile();
        TimeUnit.SECONDS.sleep(1L);
        run();
    }

    public static void createJavaFile(ANTLRInputStream input) throws Exception{
        PSEUDOLexer lexer = new PSEUDOLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PSEUDOParser parser = new PSEUDOParser(tokens);
        ParseTree tree = parser.programa();

        String instructions = new Visitor().visit(tree);

        String code = "public class Code {\n" +
                "\tpublic static void main(String args[]){\n\t\t" +
                "java.util.Scanner input = new java.util.Scanner(System.in);" +
                instructions + "\n" +
                "\t}\n" +
                "}";

        PrintWriter writer = new PrintWriter("Code.java", "UTF-8");
        writer.println(code);
        writer.close();
    }


    public static void compile() throws Exception{
        Path directory = Paths.get(System.getProperty("user.dir"));
        Runtime.getRuntime().exec("javac " + directory.toString() + "\\Code.java");
    }

    public static void  run() throws Exception {
        Runtime rt = Runtime.getRuntime();
        rt.exec("cmd /c start run.bat");
    }

}
