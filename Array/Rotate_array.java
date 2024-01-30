package Array;

import java.util.Scanner;

public class Rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // rotate array
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        // left rotate by k
        System.out.println("Left rotate by(k)? ");
        k = sc.nextInt();
        while (k > 0) {
            int temp1 = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp1;
            k--;
        }

        // right rotate
        int temp2 = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp2;

        // right rotate by k elements
        System.out.println("Right rotate by(k)? ");
        k = sc.nextInt();
        while (k > 0) {
            int temp3 = arr[arr.length - 1];
            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp3;
            k--;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
