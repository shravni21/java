package Loops;

import java.util.Scanner;

public class Display_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The digits in number are: ");
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            System.out.print(rem + " ");
        }

    }

}
