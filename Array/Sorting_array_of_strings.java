package Array;

import java.util.Arrays;

public class Sorting_array_of_strings {
    public static void main(String[] args) {
        String[] stringArray = { "banana", "apple", "orange", "grape", "kiwi" };

        Arrays.sort(stringArray);

        System.out.println("Sorted array of strings:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
