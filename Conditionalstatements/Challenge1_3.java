package Conditionalstatements;

// Find grades for given marks
import java.util.Scanner;

public class Challenge1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics, chemistry, maths, english, elective1, elective2;
        System.out.println("Enter marks for each subject out of 100 :-");
        System.out.println("Physics:");
        physics = sc.nextInt();
        System.out.println("Chemistry:");
        chemistry = sc.nextInt();
        System.out.println("Mathematics:");
        maths = sc.nextInt();
        System.out.println("English:");
        english = sc.nextInt();
        System.out.println("Elective1:");
        elective1 = sc.nextInt();
        System.out.println("Elective2:");
        elective2 = sc.nextInt();
        int total = physics + chemistry + maths + english + elective1 + elective2;
        float percentage = (total) * 100f / 600;
        System.out.println("Total marks obtained: " + total + "/600");
        System.out.println("Your percentage is : " + percentage);
        System.out.printf("You have obtained ");
        if (percentage >= 90) {
            System.out.println("A grade!");
        } else if (percentage <= 89 && percentage >= 70) {
            System.out.println("B grade!");
        } else if (percentage <= 79 && percentage >= 60) {
            System.out.println("C grade!");
        } else if (percentage <= 59 && percentage >= 45) {
            System.out.println("D grade.");
        } else {
            System.out.println("F grade.");
        }
        sc.close();
    }

}