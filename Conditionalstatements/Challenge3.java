package Conditionalstatements;

// Display name of the day based on the number

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int d = sc.nextInt();
        if (d > 7) {
            System.out.println("Enter valid day");
        } else {
            if (d == 1)
                System.out.println("Sunday");
            else if (d == 2)
                System.out.println("Monday");
            else if (d == 3)
                System.out.println("Tuesday");
            else if (d == 4)
                System.out.println("wednesday");
            else if (d == 5)
                System.out.println("Thursday");
            else if (d == 6)
                System.out.println("Friday");
            else if (d == 7)
                System.out.println("Saturday");
        }
    }

}