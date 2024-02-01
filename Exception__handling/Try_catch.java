package Exception__handling;

import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println("The division of two numbers is: " + c);

        } catch (ArithmeticException e) {
            System.out.println("The denominator should not be 0.");
        }
        System.out.println("Exit.");
    }
}
