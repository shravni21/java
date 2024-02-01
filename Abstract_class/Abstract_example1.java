package Abstract_class;

abstract class Hospital {
    abstract void emergency();

    abstract void admit();

    abstract void appointment();

    abstract void billing();

}

class Myhospital extends Hospital {

    @Override
    void emergency() {
        System.out.println("Emergency section.");

    }

    @Override
    void admit() {
        System.out.println("Patient must be admitted.");

    }

    @Override
    void appointment() {
        System.out.println("If patient may take an appointment");

    }

    @Override
    void billing() {
        System.out.println("Billing section.");
    }
}

public class Abstract_example1 {
    public static void main(String[] args) {
        Hospital h = new Myhospital();
        h.billing();
        h.appointment();
        h.emergency();
        h.admit();
    }
}
