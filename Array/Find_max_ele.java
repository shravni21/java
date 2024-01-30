package Array;

import java.util.Scanner;

public class Find_max_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxi = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + maxi);
    }
}
