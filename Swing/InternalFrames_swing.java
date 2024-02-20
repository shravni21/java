import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyInternalFrame extends JInternalFrame {
   static int cnt=0;
    JTextArea ta;
    JScrollPane sp;

    MyInternalFrame() {
        //Frame number:
        super("Document: "+(++cnt), true,true,true,true);
        ta= new JTextArea();
        sp= new JScrollPane();
        add(sp);

        JMenuBar mb= new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1= new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);


    }


}

class MyFrame5 extends JFrame implements ActionListener {
    JDesktopPane jp;
    MyFrame5() {
        super("Internal Frame Demo");
        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");
        m1.addActionListener(this);
        d.add(m1); // Adding JMenuItem to JMenu
        mb.add(d); // Adding JMenu to JMenuBar
        setJMenuBar(mb); // Setting JMenuBar to the frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame i = new MyInternalFrame();
        jp.add(i);
    }
}

public class InternalFrames_swing {
    public static void main(String[] args) {
        MyFrame5 f = new MyFrame5();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
