package Methods;

public class Varargs_discounts {
    static double discount(double... price) {
        double sum = 0;
        for (int i = 0; i < price.length; i++) {
            sum += price[i];
        }
        double dis = 0;
        if (sum <= 500) {
            dis = 0.1 * sum;
        } else if (sum > 500 && sum <= 1000) {
            dis = 0.2 * sum;
        } else if (sum > 1000 && sum <= 2000) {
            dis = 0.25 * sum;
        } else if (sum > 2000) {
            dis = 0.28 * sum;
        }
        return dis;
    }

    public static void main(String[] args) {
        System.out.println(discount(100.23, 87.100, 89.23, 300.04, 890));
    }
}
