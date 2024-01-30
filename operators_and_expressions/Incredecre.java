import java.lang.*;
import java.util.Scanner;

public class Incredecre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        char a = sc.next().charAt(0);
        int y = (x++) * 5;
        int z = (++x) * 5;
        int k = (++z) * 5 + (y++) * 10;
        System.out.println("The values of y and z became " + y + " " + z);
        System.out.println("The character is " + a);
        System.out.println("The value of k becomes " + k);
    }

}