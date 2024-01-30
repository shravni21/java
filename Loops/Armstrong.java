package Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int n1 = n;
        int size = 0;
        while (n1 > 0) {
            int rem = n1 % 10;
            n1 /= 10;
            size++;
        }
        // System.out.println("Size " + size);
        n1 = n;
        while (n1 > 0) {
            int rem = n1 % 10;
            n1 /= 10;
            int temp = power(rem, size);
            // System.out.println(temp);
            sum += temp;
        }
        // System.out.println(sum);
        if (sum == n)
            System.out.println("Yes, entered number is an Armstrong number.");
        else
            System.out.println("Not an Armstrong number.");

    }

    public static int power(int n, int k) {
        int ans = 1;
        for (int i = 0; i < k; i++) {
            ans *= n;
        }
        return ans;
    }

}