package Loops;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("enter value of k");
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = k;
            for (int j = 1; j <= n; j++) {
                System.out.format("%3d", temp);
                temp++;
            }
            k++;
            System.out.print("\n");
        }

        System.out.println();
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.format("%3d", cnt);
                cnt++;

            }
            System.out.println(" ");
        }

    }

}