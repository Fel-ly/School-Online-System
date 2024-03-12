import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SOS extends JFrame implements ActionListener {
    public static void main(String[] args) {
        SOS myWindow  = new SOS("University Management System");
        myWindow.setVisible(true);
    }

    // creating the SOS constructor
    public SOS(String title){
        setSize(400,600);
        setTitle(title);

        // creating the file menu
        JMenuBar myMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        // adding it to the meenu bar
        myMenuBar.add(fileMenu);
        setJMenuBar(myMenuBar);
        // creating the menuitem open in file
        JMenuItem openFile = new JMenuItem("Open");
        openFile.addActionListener(this);
        fileMenu.add(openFile);

        // the edit menu
        JMenu editMenu = new JMenu("Edit");
        myMenuBar.add(editMenu);
        //menuitems - copy and paste
        JMenuItem  copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        JMenuItem  paste = new JMenuItem("Paste");
        //add to menu
        editMenu.add(copy);
        editMenu.add(paste);

        //help menu
        JMenu helpMenu = new JMenu("Help");
        myMenuBar.add(helpMenu);
        // menu item
        JMenuItem  help = new JMenuItem("? Help");
        helpMenu.add(help);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
