package Inheritance;

class parent {
    public parent() {
        System.out.println("Parent constructor is called!");
    }

    public parent(int x) {
        System.out.println("Parameterised Parent constructor is called!");
    }
}

class child extends parent {
    public child() {
        System.out.println("Child constructor called!");
    }

    public child(int x) {

        System.out.println("Parameterised Child constructor called!" + x);
    }

    public child(int x, int y) {
        super(x);
        System.out.println("2 params of grand child! " + x + " " + y);
    }
}

// class grandchild extends child {
// public grandchild() {
// System.out.println("Grandchild constructor called!");
// }

// public grandchild(int x) {
// System.out.println("Parameterised Grandchild constructor called!" + x);
// }

// public grandchild(int x, int y) {

// System.out.println("2 params of grand child! ");
// }
// }

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        child gd = new child(20, 23);

    }
}
