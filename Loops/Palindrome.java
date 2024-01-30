package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String s = sc.nextLine();
        boolean flag = true;
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            // System.out.println(s.charAt(i) + " " + s.charAt(n - i - 1));
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag == false) {
            System.out.println("String is Not Palindrome.");
        } else {
            System.out.println("String is Palindrome.");
        }

    }

}
