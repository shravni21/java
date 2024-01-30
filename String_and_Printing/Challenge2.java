package String_and_Printing;
// Find if number is bindary or not

// Find is hexadecimal or not

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String s = sc.nextLine();
        if (s.matches("[01]+")) {
            System.out.println("It's a Binary Number");
            System.out.println("Entered number is Not Hexadecimal");
        } else {
            System.out.println("Entered number is Not Binary");
            if (s.matches("[0-9A-F]+")) {
                System.out.println("It's a Hexadecimal");
            } else {
                System.out.println("Entered number is Not Hexadecimal");
            }
        }
        sc.close();
    }

}