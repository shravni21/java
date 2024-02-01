
class test {
    static int x = 10;
    int y = 100;

    void show() {
        System.out.println("x and y are: " + x + " " + y);
    }

    static void display() {
        System.out.println("only x is accesible: " + x);
    }
}

// only the inner classes can static.

public class static_members {
    public static void main(String[] args) {
        test t1 = new test();
        t1.y = 20;
        t1.show();

        test t2 = new test();
        t2.show();
    }
}
