package Array;

import java.util.Scanner;

public class Array_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = { 1, 2, 3, 4, 5 };
        int c[];
        c = new int[10];
        int[] D = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        for (int i = 0; i < A.length; i++)
            System.out.println(A[i]);
        for (int x : A)
            System.out.println(x);

        B[2] = 15;

    }

}