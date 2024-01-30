package Array;

import java.util.Scanner;

public class Delete_an_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int x = 3;
        for (int i = x; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        for (int x1 : arr) {
            System.out.print(x1 + " ");
        }
    }
}
