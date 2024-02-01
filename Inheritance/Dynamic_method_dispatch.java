package Inheritance;

// 
class Super {
    public void meth1() {
        System.out.println("meth1 of super.");
    }

    public void meth2() {
        System.out.println("meth2 of super");
    }
}

class sub extends Super {
    @Override
    public void meth2() {
        System.out.println("meth2 of sub.");
    }

    public void meth3() {
        System.out.println("meth3 of super.");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Super sup = new sub();
        sup.meth1();
        sup.meth2();
    }
}
