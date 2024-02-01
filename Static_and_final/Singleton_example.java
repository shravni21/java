class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;
    private float sugarQty;
    private float milkQty;

    static private CoffeeMachine our = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
        sugarQty = 1;
        milkQty = 1;
    }

    public void fillwater(float water) {
        waterQty = water;
    }

    public void fillsugar(float sugar) {
        sugarQty = sugar;
    }

    public void fillmilk(float milk) {
        milkQty = milk;
    }

    public void fillcoffee(float coffee) {
        coffeeQty = coffee;
    }

    public float getCoffee() {
        return 0.23f;
    }

    static public CoffeeMachine getInstance() {
        if (our == null)
            our = new CoffeeMachine();
        return our;

    }
}

public class Singleton_example {
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();

        System.out.println(m1 + " " + m2 + " " + m3);
        if (m1 == m2 && m1 == m3)
            System.out.println("Same");
    }
}
