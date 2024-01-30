package Methods;

import java.util.Scanner;

public class Reverse_method_overloading {
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return rev;

    }

    static int[] reverse(int a[], int n) {
        int i = 0, j = n - 1;
        while (j > i) {
            swap(a, i, j);
            i++;
            j--;
        }
        return a;
    }

    private static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = reverse(arr, n);
        System.out.println("Reversed array is: ");
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Enter the number to reverse: ");
        int k = sc.nextInt();
        System.out.println("Reversed number is: " + reverse(k));

    }
}
