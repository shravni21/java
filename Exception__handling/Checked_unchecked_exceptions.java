package Exception__handling;

import java.io.*;

class LowBalanaceException extends Exception {
    public String toString() {
        return "Balanace is less than 5000.";
    }
}

public class Checked_unchecked_exceptions {
    static void fun1() {
        // try {

        // System.out.println("Division is: " + 10 / 0);
        // } catch (Exception e) {
        // // e.printStackTrace();
        // System.out.println(e.getMessage());
        // }
        // FileInputStream fi = new FileInputStream("My.txt");

        try {
            throw new LowBalanaceException();
        } catch (LowBalanaceException e) {
            System.out.println(e);
        }

    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
