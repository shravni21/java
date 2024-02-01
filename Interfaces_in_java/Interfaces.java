package Interfaces_in_java;

interface test1 {
    void meth1();

    void meth2();
}

class mytest implements test1 {
    public void meth1() {
        System.out.println("Meth1 implemented.");

    }

    public void meth2() {
        System.out.println("Meth2 implemented.");
    }

    public void meth3() {
        System.out.println("This is third method.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // Calling overrided methods - achieving dynamic method dispatch
        // called runtime polymorphism
        test1 t = new mytest();
        t.meth1();
        t.meth2();
    }
}
