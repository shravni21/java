import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame9 extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {
    JComboBox cb;
    JList list;
    JSpinner sp1, sp2;
    JTextField tf;

    MyFrame9() {
        super("Spinner Demo");

        //this data is called as model, activity called as controller, visual thing is called as view
        String Countries[] = {"India", "Canada", "USA", "UK", "Australia"};
        String months[] = {"January", "February", "March", "April", "may", "June", "July", "August", "September", "October", "November", "December"};
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        cb = new JComboBox(Countries);
        list = new JList(months);
        list.setVisibleRowCount(5);
        tf = new JTextField(15);

        sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        sp2 = new JSpinner(new SpinnerListModel(days));

        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);

        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText((String) list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==sp1)
        tf.setText(sp1.getValue()+"");
        else tf.setText((String) sp2.getValue());
    }
}

public class Jspinner_Jlist_Jcombobox {
    public static void main(String[] args) {
        MyFrame9 f = new MyFrame9();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
