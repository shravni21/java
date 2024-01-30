package Conditionalstatements;

// Find radix of a given number in a string

import java.util.Scanner;

public class Challenge2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String s = sc.nextLine();
        if (s.matches("[01]+"))
            System.out.println("Binary number, radix is 2");
        else if (s.matches("[0-7]+"))
            System.out.println("Octal Number, radix is 8");
        else if (s.matches("[0-9]+"))
            System.out.println("Decimal Number, radix is 10");
        else if (s.matches("[0-9A-F]+"))
            System.out.println("Hexadecimal Number, radix is 16");
        else
            System.out.println("Invalid number.");

        sc.close();
    }

}