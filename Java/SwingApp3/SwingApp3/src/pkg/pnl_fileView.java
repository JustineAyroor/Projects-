package pkg;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.table.JTableHeader;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Collections;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class pnl_fileView extends JPanel {
    
static String s1;
File f1;
    //  public pnl_fileView(){
    private myFile projectFile;
    public pnl_fileView(myFile dir) {
        //Create file explorer
        //Need to add setup for root folder change.
        //Config.getProject(); //This gets the current file from the config file.
        //Begin choose File
        if(projectFile == null){
            JFileChooser chooser;
            String choosertitle = "Please Choose a Root Folder";
            chooser = new JFileChooser(); 
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle(choosertitle);
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            //
            // disable the "All files" option.
            //
            chooser.setAcceptAllFileFilterUsed(false);
            //    
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
                System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
                //s1=""+chooser.getSelectedFile();
                System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
                projectFile = new myFile(chooser.getSelectedFile().getAbsolutePath());
                //projectFile = chooser.getSelectedFile();
            }
            else {
                System.out.println("No Selection ");
            }
        }
        else {
            // Figure out where in the filesystem to start displaying
        }

        //End choose file
        setLayout(new BorderLayout());

        // Make a tree list with all the nodes, and make it a JTree
        JTree tree = new JTree(addNodes(null, projectFile));

        // Add a listener
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) e
                        .getPath().getLastPathComponent();
                System.out.println("You selected " + node);
                s1= node.toString();
                f1= new File(s1);
               // String arr[][]={{f1.getName()+"",f1.getPath()+"",f1.length()+""}}; 
                //System.out.println(++);
                
                t1.setValueAt(f1.getName(), 0,0);
                t1.setValueAt(f1.length()+"", 0,1);
                
            }
        });

        // Lastly, put the JTree into a JScrollPane.
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.getViewport().add(tree);
        add(BorderLayout.CENTER, scrollpane);
    }

    /** Add nodes from under "dir" into curTop. Highly recursive. */
    DefaultMutableTreeNode addNodes(DefaultMutableTreeNode curTop, myFile dir) {
        String curPath = dir.getPath();
        System.out.println(curPath);
        DefaultMutableTreeNode curDir = new DefaultMutableTreeNode(curPath);
        if (curTop != null) { // should only be null at root
            curTop.add(curDir);
        }
        Vector<String> ol = new Vector<String>();
        String[] tmp = dir.list();
        for (int i = 0; i < tmp.length; i++)
            ol.addElement(tmp[i]);
        Collections.sort(ol, String.CASE_INSENSITIVE_ORDER);
        myFile f;
        Vector<String> files = new Vector<String>();
        // Make two passes, one for Dirs and one for Files. This is #1.
        for (int i = 0; i < ol.size(); i++) {
            String thisObject = (String) ol.elementAt(i);
            String newPath;
            if (curPath.equals("."))
                newPath = thisObject;
            else
                newPath = curPath + myFile.separator + thisObject;
            System.out.println("this is the path: " + newPath);
            if ((f = new myFile(newPath)).isDirectory())
                addNodes(curDir, f);
            else
                files.addElement(thisObject);
        }
        // Pass two: for files.
        for (int fnum = 0; fnum < files.size(); fnum++)
            curDir.add(new DefaultMutableTreeNode(files.elementAt(fnum)));
        return curDir;
    }

    public Dimension getMinimumSize() {
        return new Dimension(200, 400);
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 400);
    }
    static JTable t1;
    /** Main: make a Frame, add a FileTree */
    public static void main(String[] av) {
    	//pnl_fileView pnl= new pnl_fileView();
        JFrame frame = new JFrame("FileTree");
        frame.setForeground(Color.black);
        frame.setBackground(Color.lightGray);
        Container cp = frame.getContentPane();
        JPanel p1= new JPanel(new BorderLayout());
        JPanel p2= new JPanel(new BorderLayout());
        
        if (av.length == 0) {
            //cp.add(new pnl_fileView(new myFile(".")));
            p1.add(new pnl_fileView(new myFile(".")), BorderLayout.CENTER);
        } else {
            //cp.setLayout(new BoxLayout(cp, BoxLayout.X_AXIS));
            p1.setLayout(new BoxLayout(cp, BoxLayout.X_AXIS));
            for (int i = 0; i < av.length; i++)
                //cp.add(new pnl_fileView(new myFile(av[i])));
            	p1.add(new pnl_fileView(new myFile(av[i])), BorderLayout.CENTER);
        }

        JSplitPane p= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
       
        p.setTopComponent(p1);
        p.setBottomComponent(p2);

        frame.add(p, BorderLayout.CENTER);
        p.setDividerLocation(0.5);   
       // File f1= new File(s1);
        String data[][]={{"",""}};
		String col[]={"Name","Size"};
        
        t1= new JTable(data, col);
        JTableHeader header = t1.getTableHeader();
        //JPanel panel = new JPanel();
       // panel.setLayout(new BorderLayout());
        //panel.add(header, BorderLayout.NORTH);
       //panel.add(table, BorderLayout.CENTER);
        p2.add(header, BorderLayout.NORTH);
        p2.add(t1, BorderLayout.CENTER);
        frame.add(p);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class myFile extends File{
    public myFile(String pathname) {
        super(pathname);

    }
    public String toString() {
        return "Hello World!";
    }
    public String getAbsolutePath(){
        return "hi";
    }
}

