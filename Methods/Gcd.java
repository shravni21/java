package Methods;

import java.util.Scanner;

public class Gcd {
    static int gcd(int a, int b) {
        if (b > a)
            return gcd(b, a);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int k = gcd(a, b);
        System.out.println("The GCD is: " + k);
    }
}
