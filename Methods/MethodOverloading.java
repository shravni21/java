package Methods;

import java.util.Scanner;

// Achieving polymorphism with method overloading

public class MethodOverloading {
    static int find_max(int x, int y) {
        return x > y ? x : y;
    }

    static float find_max(float x, float y) {
        return x > y ? x : y;
    }

    public static void main(String[] args) {

        System.out.println(find_max(10.9f, 12.3f));
        System.out.println(find_max(10, 20));
    }
}
