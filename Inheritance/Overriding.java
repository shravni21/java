package Inheritance;

class Super1 {
    public void display() {
        System.out.println("SuperClass Display!");
    }

    public void meth1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'meth1'");
    }
}

class Subclass extends Super1 {
    @Override
    public void display() {
        System.out.println("SubClass Display!");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Super1 s1 = new Super1();
        s1.display();
        Subclass s2 = new Subclass();
        s2.display();
        Super1 su = new Subclass();
        su.display();
    }
}
