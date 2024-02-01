package Inheritance;

class car {
    public void Started() {
        System.out.println("Car Started!");
    }

    public void Accelerated() {
        System.out.println("Car is accelerated.");
    }

    public void ChangeGear() {
        System.out.println("Gear is changed.");
    }
}

class LuxuryCar extends car {
    public void ChangeGear() {
        System.out.println("Automated gear.");
    }

    public void Openroof() {
        System.out.println("Roof is opened.");
    }
}

public class Override_example2 {
    public static void main(String[] args) {
        LuxuryCar c = new LuxuryCar();
        c.Started();
        c.Accelerated();
        c.ChangeGear();
        c.Openroof();
    }
}
