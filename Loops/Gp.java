package Loops;

import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, r, n;
        System.out.println("Enter first term of GP: ");
        a = sc.nextInt();
        System.out.println("Enter common ratio: ");
        r = sc.nextInt();
        System.out.println("Enter number of terms you want to print: ");
        n = sc.nextInt();
        int n1 = n;
        while (n > 0) {
            if (n == n1)
                System.out.print(a + " ");
            else {
                a = a * r;
                System.out.print(a + " ");
            }
            n--;

        }

    }

}