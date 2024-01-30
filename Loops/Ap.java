package Loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, d, n;
        System.out.println("Enter first term of an AP: ");
        a = sc.nextInt();
        System.out.println("Enter common difference: ");
        d = sc.nextInt();
        System.out.println("Enter total number of terms you want: ");
        n = sc.nextInt();

        while (n > 0) {
            a = a + d;
            System.out.print(a);
            if (n > 1)
                System.out.print(", ");
            if (n == 1)
                System.out.println(".");
            n--;
        }

    }

}
