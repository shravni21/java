package Abstract_class;

abstract class Super {
    public Super() {
        System.out.println("Super constructor.");
    }

    public void meth1() {
        System.out.println("Method1 of super class.");
    }

    abstract public void meth2();
}

class sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Meth2 of subclass.");
    }
}

public class Abstract_example {
    public static void main(String[] args) {
        // Abstract classes can not be instantiated.
        Super s = new sub();
        s.meth1();
        s.meth2();
    }
}
