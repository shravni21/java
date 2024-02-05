package Practice;

interface pi1 {
    public void parent1();

}

interface pi2 {
    public void parent2();

}

abstract class abs1 {
    abs1() {
        System.out.println("constructor is called.");
    }

    void meth1() {
        System.out.println("Method 1 from abstract class.");
    }

    abstract void function();
}

class child3 extends abs1 {
    @Override
    void function() {
        System.out.println("Method of abstract class.");
    }

    void abs12() {
        System.out.println("Just a method. ");
    }
}

public class Multiple_inheritance implements pi1, pi2 {
    public void parent1() {
        System.out.println("Parent1 is implemented.");
    }

    public void parent2() {
        System.out.println("Parent2 is implemented.");
    }

    public void display() {
        System.out.println("It is only a method.");
    }

    public static void main(String[] args) {
        Multiple_inheritance m = new Multiple_inheritance();
        m.display();
        m.parent1();
        abs1 ch = new child3();
        ch.function();
        child3 ch1 = new child3();
        ch1.function();
        ch1.abs12();
        ch1.meth1();
    }

}
