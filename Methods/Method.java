package Methods;

import java.util.Scanner;

public class Method {
    int solve(int x, int y) {
        return ((x > y) ? x : y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the values of A and B ");
        a = sc.nextInt();
        b = sc.nextInt();
        Method mp = new Method();
        System.out.println("The greater element is: " + mp.solve(a, b));
        // System.out.println("The greater element is: " + solve(a, b));
    }
}
