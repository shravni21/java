package Inner_classes;

class Outer2 {
    void Display() {
        class Inner_class1 {
            void inner_display() {
                System.out.println("Local Inner class!");
            }
        }
        Inner_class1 i = new Inner_class1();
        i.inner_display();
    }
}

public class Local_inner_class {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.Display();
    }
}
