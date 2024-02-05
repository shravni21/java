package Practice;

import java.util.*;

class Arithmetic {

    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    Adder(int a, int b) {

    }
}

public class InheritanceII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adder ad = new Adder(10, 12);
        System.out.println("My superclass is: " + ad.getClass().getSuperclass().getName());
        System.out.println(ad.add(10, 12) + " " + ad.add(23, 230) + " " + ad.add(82, 42));

    }
}
