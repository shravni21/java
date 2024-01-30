package Array;

import java.util.Scanner;

// insert element at index
public class Insert_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int n = 5;
        int x = 3, ele = 18;
        for (int i = n; i > x; i--) {
            arr[i] = arr[i - 1];
        }
        arr[x] = ele;
        for (int x1 : arr) {
            System.out.print(x1 + " ");
        }

    }
}
