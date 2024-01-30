package Array;

import java.util.Scanner;

public class Matrix_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the matrix: ");
        n = sc.nextInt();
        int A[][] = new int[n][n];
        System.out.println("First matrix: ");
        for (int i = 0; i < n; i++) {
            // System.out.println("Enter " + (i + 1) + "th row: ");
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }

        }
        int B[][] = new int[n][n];
        System.out.println("Second matrix: ");
        for (int i = 0; i < n; i++) {
            // System.out.println("Enter " + (i + 1) + "th row: ");
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] += B[i][j];
            }
        }
        System.out.println("Sum: ");
        for (int x[] : A) {
            for (int x1 : x) {
                System.out.print(x1 + " ");
            }
            System.out.print("\n");
        }

    }
}
