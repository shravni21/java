package Exception__handling;

import java.util.*;

public class Example {
    static Integer division(Integer a, Integer b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Division by zero is not allowed.");
        Integer div = a / b;

        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a, b;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            Integer res = division(a, b);
            System.out.println("Division of two numbers is: " + res);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }
    }
}
