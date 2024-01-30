package Methods;

import java.util.Scanner;

public class Max_in_array {
    static int find_max(int arr[], int n) {
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi)
                maxi = arr[i];
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, maxi = -1;
        System.out.println("Enter the size of the array ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum element of the array is: " + find_max(arr, n));

    }
}
