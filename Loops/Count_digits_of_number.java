package Loops;

import java.util.Scanner;

public class Count_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            i++;
        }
        System.out.println(i);

    }

}
