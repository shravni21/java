package Loops;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i)
                    System.out.print("* ");
                else
                    System.out.print(" ");

            }

            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (5 - i >= j)
                    System.out.print(" ");
                else
                    System.out.print("* ");

            }

            System.out.println();
        }
        System.out.println();
        // ----------- Rhombus----------------
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (5 - i >= j)
                    System.out.print(" ");
                else
                    System.out.print("* ");

            }
            for (int j = 1; j < n; j++) {
                if (5 - i >= j)
                    System.out.print("* ");
                else
                    System.out.print(" ");

            }

            System.out.println();
        }
        System.out.println();
        // ----------odd Triangular----------------------

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        // --------------------Kite------------------------
        System.out.println();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (5 - i >= j)
                    System.out.print("  ");
                else
                    System.out.print("* ");

            }
            for (int j = 1; j < n; j++) {
                if (j < i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            for (int j = 1; j < n; j++) {
                if (5 - i >= j)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }

    }

}
