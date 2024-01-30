package Methods;

import java.util.Scanner;

public class Validate_name_age_method_overloading {
    static boolean validate(int age) {
        if (age >= 18)
            return true;
        return false;
    }

    static boolean validate(String s1) {
        String s = s1.toLowerCase().replaceAll("\\s+", "");

        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                // System.out.println(s.charAt(i));
            } else {
                flag = false;
                break;
            }

        }
        // System.out.println(s);
        if (flag == false)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (validate(name) == true) {
            System.out.println("Hey " + name + ", You have entered your name correctly.");
        } else {
            System.out.println("Enter name correctly.");
        }
        if (validate(age)) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting.");
        }
    }
}
