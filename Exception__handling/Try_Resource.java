package Exception__handling;

import java.io.*;
import java.util.*;

public class Try_Resource {
    static FileInputStream fi;
    static Scanner sc;

    static void divide() throws Exception {
        try (FileInputStream fi = new FileInputStream("C:/Users/HP/java/Exception__handling/input.txt")) {
            // fi = new FileInputStream("C:/Users/HP/java/Exception__handling/input.txt");
            // System.out.println("Found");
            sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // System.out.println("values are: " + a + " " + b + " " + c);
            System.out.println(a / b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // finally {
        // fi.close();
        // sc.close();
        // }
    }

    public static void main(String[] args) throws Exception {

        try {
            divide();
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e);
        }
        // int x = sc.nextInt();
        // System.out.println(x);
    }
}
