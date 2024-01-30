package Array;

import java.util.Scanner;

public class Searching_an_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.println("Enter the size of the array and target : ");
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                idx = i + 1;
                break;
            }
        }
        System.out.println((idx == -1) ? "Not found" : "Element found at index: " + (idx + 1));

    }
}
