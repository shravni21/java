package Generics;

//Implement a generic method in Java that takes 
//an array of any type and returns the maximum element in the array. 
//Test this method with arrays of integers, doubles, and strings.

import java.util.*;

public class Generics_1 {
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array cannot be null.");
        T maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(maxi) > 0) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Integer arr[] = { 2, 4, 5, 7, 9, 10, 6 };
        String arr1[] = { "Apple", "Banana", "Cat", "Dog", "Fish" };
        System.out.println("MAximum number is: " + findMax(arr));
        System.out.println("Greater string is:  " + findMax(arr1));
    }
}
