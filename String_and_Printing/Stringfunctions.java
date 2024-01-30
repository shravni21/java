package String_and_Printing;

import java.lang.*;
import java.util.Scanner;

public class Stringfunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Java Program";
        String s1 = "JAVA";
        char c[] = { 'H', 'E', 'L', 'L', 'O' };
        String s2 = new String(c);
        byte b[] = { 65, 66, 67, 68 };
        String s3 = new String(b, 2, 2);
        System.out.println(s3);
        String temp1 = "JAVA";
        System.out.println(temp1 == s1);
    }

}