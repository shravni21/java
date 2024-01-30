package Conditionalstatements;

// Menu driven program for the arithematic operations

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("------------Menu----------");
        System.out.println("Addition");
        System.out.println("Substraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        System.out.println("-----------Welcome!----------");
        System.out.println("Which operation you wanted to perform?");

        String s = new String(sc.next());
        // System.out.println(s);
        int op = 0;
        if (s.equalsIgnoreCase("Addition"))
            op = 1;
        else if (s.equalsIgnoreCase("Substraction"))
            op = 2;
        else if (s.equalsIgnoreCase("Multiplication"))
            op = 3;
        else if (s.equalsIgnoreCase("Division"))
            op = 4;
        else
            System.out.println("Kindly, correct operation");

        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("The Addition of " + a + " and " + b + " is " + (a + b));
                break;
            case 2:
                System.out.println("The Substraction of " + a + " and " + b + " is " + Math.abs(a - b));
                break;
            case 3:
                System.out.println("The Multiplication of " + a + " and " + b + " is " + (a * b));
                break;
            case 4:
                System.out.println("The Division of " + a + " and " + b + " is " + (a / b));
                break;
            default:
                System.out.println("Something went wrong :(");
                break;
        }
    }

}
