package compiler;

import jasmin.ClassFile;
import parser.PSEUDOLexer;
import parser.PSEUDOParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        ANTLRInputStream input = new ANTLRFileStream("input");
        compile(input);
        System.out.println(run());
    }

    public static void compile(ANTLRInputStream input) throws Exception{
        PSEUDOLexer lexer = new PSEUDOLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PSEUDOParser parser = new PSEUDOParser(tokens);
        ParseTree tree = parser.programa();

        createJasminCode(new Visitor().visit(tree));
    }

    private static void createJasminCode(String instructions) throws Exception{
        String code = ".class public Code\n" +
                ".super java/lang/Object\n" +
                "\n" +
                ".method public static main([Ljava/lang/String;)V\n" +
                "  .limit stack 100\n" +
                "  .limit locals 100\n" +
                "  \n" +
                instructions + "\n" +
                "  return\n" +
                "  \n" +
                ".end method";

        Path directory = Paths.get(System.getProperty("user.dir"));
        ClassFile classFile = new ClassFile();
        classFile.readJasmin(new StringReader(code), "", false);
        Path outputPath = directory.resolve(classFile.getClassName() + ".class");
        classFile.write(Files.newOutputStream(outputPath));
    }

    private static String run() throws Exception
    {
        Path directory = Paths.get(System.getProperty("user.dir"));
        Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", directory.toString(), "Code"});
        try(InputStream in = process.getInputStream()) {
            return new Scanner(in).useDelimiter("\\A").next();
        }
    }

}
