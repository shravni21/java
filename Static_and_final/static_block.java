class Temp {

    // static {
    // System.out.println("Block 1");
    // }
    // static {
    // System.out.println("Block 2");
    // }
}

public class static_block {
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Temp c = new Temp();
    }

}
