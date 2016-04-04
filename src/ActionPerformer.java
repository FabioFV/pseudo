import javax.swing.*;
import java.io.*;
import java.util.regex.Pattern;

/**
 * Created by Loammi on 4/4/2016.
 */
public class ActionPerformer {
    private final IDEGUI ide;

    public ActionPerformer(IDEGUI ide) {
        this.ide = ide;
    }

    public void actionOpen() {
        if (ide.documentHasChanged() == true) {    //si el documento esta marcado como modificado

            int option = JOptionPane.showConfirmDialog(ide.getJFrame(), "¿Desea guardar los cambios?");
            switch (option) {
                case JOptionPane.YES_OPTION:     //si elige que si
                    actionSave();               //guarda el archivo
                    break;
                case JOptionPane.CANCEL_OPTION:  //si elige cancelar
                    return;                      //cancela esta operación
                //en otro caso se continúa con la operación y no se guarda el documento actual
            }
        }

        JFileChooser fc = getJFileChooser();
        int state = fc.showOpenDialog(ide.getJFrame());

        if (state == JFileChooser.APPROVE_OPTION) {    //si elige abrir el archivo
            File f = fc.getSelectedFile();    //obtiene el archivo seleccionado

            try {

                BufferedReader br = new BufferedReader(new FileReader(f));
                ide.getJTextArea().read(br, null);
                br.close();

                ide.getJTextArea().getDocument().addUndoableEditListener(ide.getEventHandler());

               ide.getUndoManager().die();    //se limpia el buffer del administrador de edición
             //   ide.updateControls();          //se actualiza el estado de las opciones "Deshacer" y "Rehacer"

                ide.getJFrame().setTitle("PSEUDO - " + f.getName());
//                ide.getJLabelFilePath().setText(shortPathName(f.getAbsolutePath()));
//                ide.getJLabelFileSize().setText(roundFileSize(f.length()));
                ide.setCurrentFile(f);
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
    public void actionSave() {
        if (ide.getCurrentFile() == null) {    //si no hay un archivo asociado al documento actual
            actionSaveAs();    //invoca el método actionSaveAs()
        } else if (ide.documentHasChanged()) {    //si el documento esta marcado como modificado
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

//                //muestra la ubicación del archivo guardado
//                ide.getJLabelFilePath().setText(shortPathName(f.getAbsolutePath()));
//                //muestra el tamaño del archivo guardado
//                ide.getJLabelFileSize().setText(roundFileSize(f.length()));
                ide.setCurrentFile(f);
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
       // fc.setFileFilter(textFileFilter);                         //aplica un filtro de extensiones
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
