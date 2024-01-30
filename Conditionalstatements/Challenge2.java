package Conditionalstatements;

// Find the given year is a leap year

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int n = sc.nextInt();
        if (n % 4 == 0) {
            int div = n / 4;
            if (div % 2 == 0) {
                System.out.println("Entered year is not leap year.");
            } else {
                System.out.println("Entered year is leap year.");
            }
        } else {
            System.out.println("Entered year is not leap year.");

        }
        sc.close();
    }

}