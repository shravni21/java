package Inner_classes;

// abstract class my {
//     abstract void display();
// }
interface my {
    abstract void display();
}

class Outer1 {
    public void meth1() {
        my m = new my() {
            public void display() {
                System.out.println("Annonymous Inner class.");
            }
        };
        m.display();
    }
}

public class Annonymous_inner_class {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.meth1();

    }
}
