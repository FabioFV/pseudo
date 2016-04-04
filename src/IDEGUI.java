import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * Created by Loammi on 3/4/2016.
 */
public class IDEGUI {
    private JFrame frame;            
    private JMenuBar menuBar;        
    private JTextArea textArea;

    private JLabel sbFilePath;    //etiqueta que muestra la ubicación del archivo actual
    private JLabel sbFileSize;    //etiqueta que muestra el tamaño del archivo actual

    private boolean hasChanged = false;    //el estado del documento actual, no modificado por defecto
    private File currentFile = null;       //el archivo actual, ninguno por defecto

    private final EventHandler eventHandler;          //instancia de EventHandler (la clase que maneja eventos)
    private final ActionPerformer actionPerformer;    //instancia de ActionPerformer (la clase que ejecuta acciones)
    private final UndoManager undoManager;

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new IDEGUI().frame.setVisible(true);    //hace visible la GUI creada por la clase TPEditor
            }
        });
    }
    public IDEGUI(){
        try {    //LookAndFeel nativo
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.err.println(ex);
        }

        frame = new JFrame("PSEUDO");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        eventHandler = new EventHandler();              //construye una instancia de EventHandler
        actionPerformer = new ActionPerformer(this);
        undoManager = new UndoManager();


        createTextArea();
        createMenuBar();
        frame.setJMenuBar(menuBar);
        Container c = frame.getContentPane();
        c.add(new JScrollPane(textArea), BorderLayout.CENTER);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(pantalla.width / 2, pantalla.height / 2);
    }

    private void createTextArea() {
        textArea = new JTextArea("/* Bienvenido a PSEUDO */ ");    //construye un JTextArea
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.addCaretListener(eventHandler);
        textArea.addMouseListener(eventHandler);
        textArea.getDocument().addUndoableEditListener(eventHandler);
    }
    public void createMenuBar(){
        menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Archivo");

        JMenuItem itemOpen = new JMenuItem("Abrir");
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
        itemOpen.setActionCommand("cmd_open");
        itemOpen.addActionListener(eventHandler);

        JMenuItem itemSave = new JMenuItem("Guardar");
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
        itemSave.setActionCommand("cmd_save");
        itemSave.addActionListener(eventHandler);

        JMenuItem itemSaveAs = new JMenuItem("Guardar como...");
        itemSaveAs.setActionCommand("cmd_saveas");
        itemSaveAs.addActionListener(eventHandler);

        menu1.add(itemOpen);
        menu1.add(itemSave);
        menu1.add(itemSaveAs);

        JMenu menu2 = new JMenu("Ejecutar");

        JMenuItem itemRun = new JMenuItem("Ejecutar");
        itemRun.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
        itemRun.setActionCommand("cmd_run");
        itemRun.addActionListener(eventHandler);

        menu2.add(itemRun);

        menuBar.add(menu1);
        menuBar.add(menu2);

    }

    EventHandler getEventHandler() {
        return eventHandler;
    }
    UndoManager getUndoManager() {

        return undoManager;
    }

    boolean documentHasChanged() {

        return hasChanged;
    }
    void setDocumentChanged(boolean hasChanged) {

        this.hasChanged = hasChanged;
    }
    JTextArea getJTextArea() {

        return textArea;
    }
    JFrame getJFrame() {

        return frame;
    }
    File getCurrentFile() {
        return currentFile;
    }
    void setCurrentFile(File currentFile) {

        this.currentFile = currentFile;
    }
    JLabel getJLabelFilePath() {

        return sbFilePath;
    }
    JLabel getJLabelFileSize() {

        return sbFileSize;
    }
    class EventHandler extends MouseAdapter implements ActionListener,
            CaretListener,
            UndoableEditListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String ac = ae.getActionCommand();    //se obtiene el nombre del comando ejecutado
            System.out.println(ae.getActionCommand());
            if (ac.equals("cmd_open")) {    //opción seleccionada: "Abrir"
                actionPerformer.actionOpen();
            } else if (ac.equals("cmd_save")) {    //opción seleccionada: "Guardar"
                actionPerformer.actionSave();
            } else if (ac.equals("cmd_saveas")) {    //opción seleccionada: "Guardar como"
                actionPerformer.actionSaveAs();
            } else if(ac.equals("cmd_run")){
                actionPerformer.actionRun();
            }

        }

        @Override
        public void caretUpdate(CaretEvent e) {
            final int caretPos;  //valor de la posición del cursor sin inicializar
            int y = 1;           //valor de la línea inicialmente en 1
            int x = 1;           //valor de la columna inicialmente en 1

            try {

                caretPos = textArea.getCaretPosition();

                y = textArea.getLineOfOffset(caretPos);

                /** a la posición del cursor se le resta la posición del inicio de la línea para
                 determinar el valor de la columna actual */
                x = caretPos - textArea.getLineStartOffset(y);

                //al valor de la línea actual se le suma 1 porque estas comienzan contándose desde 0
                y += 1;
            } catch (BadLocationException ex) {    //en caso de que ocurra una excepción
                System.err.println(ex);
            }

        }
        @Override
        public void undoableEditHappened(UndoableEditEvent uee) {
            undoManager.addEdit(uee.getEdit());
            hasChanged = true;
        }

    }
}
