package Methods;

import java.util.Scanner;

public class Varargs_sum_of_all_ele {
    static int sum(int... A) {
        int s = 0;
        for (int i = 0; i < A.length; i++) {
            s += A[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(1, 8, 9, 10, 34, 25, 9, 10));
    }
}
