package Inheritance;

class Tv {
    public void switchON() {
        System.out.println("TV is switched on.");
    }

    public void changeChannel() {
        System.out.println("Channel is changed.");
    }
}

class SmartTv extends Tv {
    @Override
    public void switchON() {
        System.out.println("Smart TV is switched on.");
    }

    @Override
    public void changeChannel() {
        System.out.println("SmartTV Channel is changed");
    }

    public void browsing() {
        System.out.println("SmartTV browsing.");
    }
}

public class Override_example {
    public static void main(String[] args) {
        Tv t = new SmartTv();
        t.switchON();
        t.changeChannel();

    }
}
