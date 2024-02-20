import com.sun.source.tree.Tree;

// Task-> Find the name of the file selected instead of path
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.*;
import java.util.*;

import static java.awt.AWTEventMulticaster.add;

class MyFrame4 extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;

    MyFrame4() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("c:/users/hp/java");
        File f = new File("C:/Users/HP/java");

        for (File x : f.listFiles()) {
            if (x.isDirectory()) {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for(File y: x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            } else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }


        tree = new JTree(root);
        label = new JLabel("No file selected.");

        tree.addTreeSelectionListener(this);
        //Scrollbar
        JScrollPane sp= new JScrollPane(tree);

        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
         label.setText(e.getPath().toString());
    }
}

public class Tree_Components {
    public static void main(String[] args) {
        MyFrame4 f4 = new MyFrame4();
        f4.setSize(500, 500);
        f4.setVisible(true);
        f4.setDefaultCloseOperation(f4.EXIT_ON_CLOSE);
    }
}
