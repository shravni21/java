package Conditionalstatements;

import java.util.Scanner;

// Display name of the month baesd on number

public class Challenge4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, know the month with the number or get the index of the month");
        System.out.println("Choose option: ");
        System.out.println("1.Month by number");
        System.out.println("2.Number by Month");
        int op = sc.nextInt();
        if (op == 1) {
            System.out.println("Enter the index of month: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid index");
                    break;
            }
        } else if (op == 2) {
            int idx = -1;
            System.out.println("Enter the month ");
            String month = sc.next();

            String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                    "October", "November", "December" };
            for (int i = 0; i < months.length; i++) {
                if (months[i].equalsIgnoreCase(month))
                    idx = i + 1;
            }
            if (idx == -1) {

                System.out.println("Invalid Input");
            } else {
                System.out.println("The index of the month is " + idx);
            }
        }

    }

}