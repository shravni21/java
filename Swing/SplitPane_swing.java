import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class MyFrame6 extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList list;
    JLabel lbl;

    MyFrame6() {
        super("Split Demo");
        String cols[] = {"Red", "Green", "Blue", "Magenta", "Yellow", "Orange", "Black"};

        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(list);

        lbl = new JLabel("");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        JScrollPane p2 = new JScrollPane(lbl);

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        sp.setDividerLocation(200);
        add(sp);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String) list.getSelectedValue();
        switch (str) {
            case "Red":
                lbl.setBackground(Color.red);
                break;
            case "Yellow":
                lbl.setBackground(Color.yellow);
                break;
            case "Green":
                lbl.setBackground(Color.green);
                break;
            case "Blue":
                lbl.setBackground(Color.blue);
                break;
            case "Orange":
                lbl.setBackground(Color.orange);
                break;
            case "Magenta":
                lbl.setBackground(Color.magenta);
                break;
            case "Black":
                lbl.setBackground(Color.black);
                break;

        }
    }
}

public class SplitPane_swing {
    public static void main(String[] args) {
        MyFrame6 f = new MyFrame6();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
