package Inner_classes;

class Outer {
    // public int x = 10;
    static int x = 10;
    Inner i = new Inner();

    class Inner {
        int y = 20;

        public void Inner_display() {
            System.out.println("Inner Display. " + x + " " + y);
        }

    }

    void Outer_display() {
        // Inner i = new Inner();
        System.out.println("Outer Display. " + i.y);
        i.Inner_display();
    }
}

public class Nested_inner_classes {
    public static void main(String[] args) {
        // Outer o = new Outer();
        // o.Outer_display();
        Outer.Inner oi = new Outer().new Inner();
        oi.Inner_display();

    }
}
