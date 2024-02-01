class Super {
    final void hello() {
        System.out.println("Hello this is final.");
    }
}

class sub extends Super {
    // cannot be override
    // void hello() {
    // System.out.println("This is from the extended.");
    // }

    void meth1() {
        System.out.println("This is from the extended.");

    }
}

public class Final_method {
    public static void main(String[] args) {

    }
}
