import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class Myframe2 extends JFrame implements ActionListener {
    JCheckBox c1, c2;
    JRadioButton r1, r2;
    JTextField tf;

    Myframe2() {
        super("From super");
        tf = new JTextField("Title Text", 20);
        tf.setBounds(10, 20, 100, 80);

        //Checkbox
        c1 = new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);

        c2 = new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        //RadioButton
        r1 = new JRadioButton("lower");
        r2 = new JRadioButton("Upper");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        //  set action  commands too:
        r1.setActionCommand("lower");
        r2.setActionCommand("upper");

        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //For radio buttons:
        switch (e.getActionCommand()) {
            case "lower":
                tf.setText(tf.getText().toLowerCase());
                break;
            case "upper":
                tf.setText(tf.getText().toUpperCase());
                break;
        }
        // For checkboxes
        int b = 0, i = 0;
        if (c1.isSelected()) b = Font.BOLD;
        if (c2.isSelected()) i = Font.ITALIC;

        Font fo = new Font("Times New Roman", b | i, 15);
        tf.setFont(fo);

    }
}

public class Jcheckbox_JradioButton {
    public static void main(String[] args) {
        Myframe2 f = new Myframe2();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
