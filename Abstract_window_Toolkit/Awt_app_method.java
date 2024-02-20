package Abstract_window_Toolkit;

import java.awt.*;

public class Awt_app_method {
    public static void main(String[] args) {
        Frame f = new Frame("My First App");

        Button b= new Button("Click");
        Label l= new Label("Name ");
        TextField tf = new TextField(20);

        f.add(b);
        f.add(l);
        f.add(tf);

        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        f.setVisible(true);
    }
}
