package Loops;

import java.util.Scanner;

public class Sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);

    }
}