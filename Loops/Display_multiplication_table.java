package Loops;

import java.util.Scanner;
//Display multiplication table

public class Display_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print multiplication table:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println((n) + " X " + (i + 1) + " = " + (n * (i + 1)));
        }

    }

}