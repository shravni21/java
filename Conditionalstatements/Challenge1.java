package Conditionalstatements;

// Find the number is odd or even
// Find person is young or not

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is even or odd: ");
        int n = sc.nextInt();
        if ((n & 1) == 0)
            System.out.println("The entered number is even.");
        else
            System.out.println("The entered number is odd.");
        System.out.println("Enter age of person to check whether he/she is young or not.");
        int n1 = sc.nextInt();
        if (n1 >= 18 && n1 <= 30) {
            System.out.println("Person is young!");
        } else {
            System.out.println("Person is not young.");
        }

    }

}