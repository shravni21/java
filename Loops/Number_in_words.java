package Loops;

import java.util.Scanner;

//Display a number in words even with tailing 0

public class Number_in_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String[] digits = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String rev = "";
        int n1 = n;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev + rem;
        }
        String ans = "";

        while (n1 > 0) {
            int rem = n1 % 10;
            String temp = digits[rem];
            ans += temp;
            ans += " ";
            n1 /= 10;
        }
        // for (int i = 0; i < 10; i++) {
        // System.out.println(digits[i]);
        // }

        System.out.println(ans);
    }

}
