package Array;

import java.util.Scanner;

public class Finding_second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = arr[0], b = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                b = a;
                a = arr[i];

            } else if (arr[i] > b) {
                b = arr[i];
            }
        }

        System.out.println("The second max elemnt is: " + b);
    }
}
