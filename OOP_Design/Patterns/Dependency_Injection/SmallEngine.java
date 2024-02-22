public class SmallEngine implements Engine {
    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Started small " + horsePower + "hpEngine.");
    }
}
