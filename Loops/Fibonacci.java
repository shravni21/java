package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many elements you want in fibonacci series: ");
        n = sc.nextInt();
        int a = 0, b = 1;
        if (n == 1)
            System.out.println(a);
        else if (n == 2)
            System.out.println(a + " " + b);
        else {
            int c;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }

}