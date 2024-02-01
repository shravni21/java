package Inheritance;

class Super {
    public void display() {
        System.out.println("SuperClass Display!");
    }
}

class Subclass extends Super {
    @Override
    public void display() {
        System.out.println("SubClass Display!");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Super s1 = new Super();
        s1.display();
        Subclass s2 = new Subclass();
        s2.display();
        Super su = new Subclass();
        su.display();
    }
}
