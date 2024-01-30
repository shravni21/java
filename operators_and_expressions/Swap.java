import java.lang.*;
import java.util.Scanner;

// swap two elements with bitwise approach
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("The values of a and b are " + a + ", " + b);
        ;
    }

}