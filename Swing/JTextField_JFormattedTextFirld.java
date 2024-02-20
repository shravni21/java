import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.*;

class MyFrame1 extends JFrame {
    MyFrame1() {
        JTextField tf = new JTextField(15);

        //formatted date
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf1 = new JFormattedTextField(df);
        tf1.setColumns(15);
        tf1.setValue(0);

        //number format
//        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false); //It doesn't accept invalid
        nft.setMaximum(10000);
        JFormattedTextField tf2 = new JFormattedTextField(nft);
        tf2.setColumns(15);
        tf2.setValue(0);

        //JText area
        JTextArea ta = new JTextArea(30, 30);
        ta.setColumns(15);
        ta.setRows(15);
        setLayout(new FlowLayout());
        add(tf);
        add(tf1);
        add(tf2);
        add(ta);
    }
}

public class JTextField_JFormattedTextFirld {
    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
