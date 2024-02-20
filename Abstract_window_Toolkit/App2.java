package Abstract_window_Toolkit;


import java.awt.*;

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    public MyFrame() {

        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("Click");
        add(l);
        add(tf);
        add(b);
    }
}

public class App2 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
