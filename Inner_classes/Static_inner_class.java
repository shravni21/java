package Inner_classes;

class outer3 {
    int x = 10;
    static int y = 20;

    static class Inner2 {
        void display() {

            System.out.println("value of y is: " + y);
        }
    }
}

public class Static_inner_class {
    public static void main(String[] args) {
        outer3.Inner2 m = new outer3.Inner2();
        m.display();
    }
}
