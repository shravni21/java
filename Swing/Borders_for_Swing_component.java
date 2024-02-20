import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

class MyFrame3 extends JFrame {
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;

    MyFrame3() {
        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("Ok");
        p = new JPanel();

        p.add(l);
        p.add(b);
        p.add(tf);


        Border br = BorderFactory.createLoweredBevelBorder();
        Border br1 = BorderFactory.createRaisedBevelBorder();
        Border br2 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        Border br4 = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        Border br5 = BorderFactory.createLineBorder(Color.green, 5);
        Border br6 = BorderFactory.createTitledBorder("Title");
        Border br7 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Title");
        Border br3 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Title", TitledBorder.CENTER, TitledBorder.LEFT);

        p.setBorder(br3);
        setLayout(new FlowLayout());
        add(p);

    }
}

public class Borders_for_Swing_component {
    public static void main(String[] args) {
        MyFrame3 f = new MyFrame3();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
