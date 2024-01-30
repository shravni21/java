package Array;

import java.util.Scanner;

public class Increasing_size_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5, 6 };
        // insert 18;
        int B[] = new int[2 * a.length];
        for (int i = 0; i < a.length; i++) {
            B[i] = a[i];
        }
        B[6] = 18;
        a = null;
        for (int x : B)
            System.out.print(x + " ");

    }
}
