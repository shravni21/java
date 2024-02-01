import mypack1.Demo;
import mypack1.Demo1;
import mypack1.inner.Demo2;

public class Test {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.display();
        Demo1 d2 = new Demo1();
        d2.display();
        Demo2 d3 = new Demo2();
        d3.display();
    }
}
