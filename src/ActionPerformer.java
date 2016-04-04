import javax.swing.*;
import java.io.*;
import java.util.regex.Pattern;

/**
 * Created by Loammi on 4/4/2016.
 */
public class ActionPerformer {
    private final IDEGUI ide;    //instancia de TPEditor (la clase principal)

    public ActionPerformer(IDEGUI ide) {
        this.ide = ide;    //guarda la instancia de la clase TPEditor
    }


    public void actionSave() {
        if (ide.getCurrentFile() == null) {    //si no hay un archivo asociado al documento actual
            actionSaveAs();    //invoca el método actionSaveAs()
        } else if (ide.documentHasChanged() == true) {    //si el documento esta marcado como modificado
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(ide.getCurrentFile()));
                ide.getJTextArea().write(bw);
                bw.close();
                ide.setDocumentChanged(false);
            } catch (IOException ex) {    //en caso de que ocurra una excepción
                //presenta un dialogo modal con alguna información de la excepción
                JOptionPane.showMessageDialog(ide.getJFrame(),
                        ex.getMessage(),
                        ex.toString(),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void actionSaveAs() {
        JFileChooser fc = getJFileChooser();    //obtiene un JFileChooser


        int state = fc.showSaveDialog(ide.getJFrame());
        if (state == JFileChooser.APPROVE_OPTION) {    //si elige guardar en el archivo
            File f = fc.getSelectedFile();    //obtiene el archivo seleccionado

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));

                ide.getJTextArea().write(bw);
                bw.close();

                //nuevo título de la ventana con el nombre del archivo guardado
                ide.getJFrame().setTitle("PSEUDO - " + f.getName());

                //muestra la ubicación del archivo guardado
                ide.getJLabelFilePath().setText(shortPathName(f.getAbsolutePath()));
                //muestra el tamaño del archivo guardado
                ide.getJLabelFileSize().setText(roundFileSize(f.length()));

                //establece el archivo guardado como el archivo actual
                ide.setCurrentFile(f);
                //marca el estado del documento como no modificado
                ide.setDocumentChanged(false);
            } catch (IOException ex) {    //en caso de que ocurra una excepción
                //presenta un dialogo modal con alguna información de la excepción
                JOptionPane.showMessageDialog(ide.getJFrame(),
                        ex.getMessage(),
                        ex.toString(),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void actionRun(){
        //TODO add logic here
    }

    private static JFileChooser getJFileChooser() {
        JFileChooser fc = new JFileChooser();                     //construye un JFileChooser
        fc.setDialogTitle("PSEUDO - Elige un archivo:");    //se le establece un título
        fc.setMultiSelectionEnabled(false);                       //desactiva la multi-selección
        //  fc.setFileFilter(textFileFilter);                         //aplica un filtro de extensiones
        return fc;    //retorna el JFileChooser
    }

    /**
     * Clase anónima interna que extiende la clase javax.swing.filechooser.FileFilter para
     * establecer un filtro de archivos en el JFileChooser.
     */
    private static FileFilter textFileFilter = new FileFilter() {

        @Override
        public boolean accept(File f) {
            return f.isDirectory() || f.getName().toLowerCase().endsWith("txt");
        }

    };
    private static String shortPathName(String longPath) {

        String[] tokens = longPath.split(Pattern.quote(File.separator));


        StringBuilder shortpath = new StringBuilder();

        //itera sobre el arreglo de cadenas
        for (int i = 0 ; i < tokens.length ; i++) {
            if (i == tokens.length - 1) {              //si la cadena actual es la última, es el nombre del archivo
                shortpath.append(tokens[i]);    //añade al resultado sin separador
                break;                          //termina el bucle
            } else if (tokens[i].length() >= 10) {     //si la cadena actual tiene 10 o más caracteres
                //se toman los primeros 3 caracteres y se añade al resultado con un separador
                shortpath.append(tokens[i].substring(0, 3)).append("...").append(File.separator);
            } else {                                   //si la cadena actual tiene menos de 10 caracteres
                //añade al resultado con un separador
                shortpath.append(tokens[i]).append(File.separator);
            }
        }

        return shortpath.toString();    //retorna la cadena resultante
    }

    private static String roundFileSize(long length) {
        //retorna el tamaño del archivo redondeado
        return (length < 1024) ? length + " bytes" : (length / 1024) + " Kbytes";
    }


}
