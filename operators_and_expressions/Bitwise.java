
import java.lang.*;
import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x = x >> 1;
        System.out.println(x);
        System.out.println(String.format("%s", Integer.toBinaryString(x)));
        x = x << 2;
        System.out.println(x);
        System.out.println(String.format("%s", Integer.toBinaryString(x)));
        System.out.println(~x);
        System.out.println(String.format("%s", Integer.toBinaryString(~x)));
    }

}