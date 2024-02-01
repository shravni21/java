package Abstract_class;

abstract class Kfc {
    public Kfc() {
        System.out.println("Constructor is called.");
    }

    void make_item() {
        System.out.println("Item is requested.");
    }

    abstract void billing();

    abstract void offer();

}

class MyKfc extends Kfc {
    public MyKfc() {
    }

    @Override
    void billing() {
        System.out.println("Here is your bill.");

    }

    @Override
    void offer() {
        System.out.println("Offer accepted.");

    }

    void festive_offer() {
        System.out.println("Here are festival special offers.");
    }

}

public class Abstract_example2 {
    public static void main(String[] args) {
        Kfc k = new MyKfc();
        k.billing();
        k.offer();

    }
}
