import javax.swing.*;
import java.awt.*;

class MyFrame10 extends JFrame {
    JToolBar tb;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JTextArea ta;

    MyFrame10() {
        super("ToolBar demo");
        tb = new JToolBar();
        b1 = new JButton(new ImageIcon("images/save.png"));
        b2 = new JButton(new ImageIcon("images/open.png"));
        b3 = new JButton(new ImageIcon("images/new.png"));
        b4 = new JButton(new ImageIcon("images/cut.png"));
        b5 = new JButton(new ImageIcon("images/copy.png"));
        b6 = new JButton(new ImageIcon("images/split.png"));
        b7 = new JButton(new ImageIcon("images/close.png"));

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);
        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        add(tb, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("Open");
    }


}

public class JMenuBar_and_JtoolBar {
    public static void main(String[] args) {
        MyFrame10 f = new MyFrame10();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
