package Methods;

import java.util.Scanner;

public class Prime {
    static boolean check(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = check(x);
        }
        for (boolean x : arr) {
            System.out.print(x + " ");
        }

    }
}
