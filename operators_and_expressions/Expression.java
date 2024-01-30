
import java.lang.*;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base, height;
        double area;
        System.out.println("Enter Base and Height ");

        base = sc.nextFloat();
        height = sc.nextFloat();
        area = 0.5 * base * height;
        System.out.println("Area of the triangle is " + area);

        // Area of triangle
        int a, b, c;
        float s;
        System.out.println("Enter the sides of triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a + b + c) / 2f;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The are of triangle is " + area);
    }
}
