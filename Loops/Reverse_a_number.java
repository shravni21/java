package Loops;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        int ans1 = 0;
        while (n > 0) {
            int rem = n % 10;
            ans1 = ans1 * 10 + rem;
            n /= 10;
            ans = ans + rem;
        }
        System.out.println(ans);
        System.out.println(ans1);
    }

}