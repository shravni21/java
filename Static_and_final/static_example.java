
class Hondacity {
    static long price = 100;
    int a, b;

    static double onRoadPrice(String city) {
        switch (city) {
            case "delhi":
                return price + price * 0.1;

            case "mumbai":
                return price + price * 0.9;
        }
        return price + price * 0.8;
    }
}

public class static_example {
    public static void main(String[] args) {
        Hondacity h1 = new Hondacity();
        Hondacity h2 = new Hondacity();
        System.out.println("price of h1 object is: " + h1.price);
        System.out.println("Price of h2 object is: " + h2.price);
        System.out.println(Hondacity.price);
        System.out.println(Hondacity.onRoadPrice("delhi"));
        System.out.println(Hondacity.onRoadPrice("mumbai"));
        System.out.println(Hondacity.onRoadPrice("Shravni"));
    }
}
