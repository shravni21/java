import javax.management.remote.SubjectDelegationPermission;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int cnt = 0;

    Myframe() {
        super("Swing Demo");
        setLayout(new FlowLayout());
        l = new JLabel("Clicked " + cnt + " Times");
        b = new JButton("Click");
        add(l);
        add(b);
//        add(new JButton("Cancel"));

        // Action listener
        b.addActionListener(this);

        //Button is highlighted
        getRootPane().setDefaultButton(b);

        // Add image instead of the button
        b.setIcon(new ImageIcon("C:/Users/HP/Downloads/favicon_io/favicon-16x16.png"));

        l.setToolTipText("Counter");
        b.setToolTipText("Click Me for Counting");
    }
    public void actionPerformed(ActionEvent ev){
        cnt++;
        l.setText("Clicked " + cnt + " Times");
    }

}

public class JFrame1_component {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
