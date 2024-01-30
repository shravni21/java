package Array;

import java.util.Scanner;

public class Sum_all_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum is: " + sum);
    }
}
