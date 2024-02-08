package Collections;

import java.util.*;

public class Collection_Arraylist_1 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        /// insert
        arr.add("Shravni");
        arr.add("Java Collections");
        arr.add("Let's see");

        // insert at index
        arr.add(0, "Piyush");

        // Add all
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Saie");
        arr1.add("Harish");

        // Insert array2 in 1
        arr.addAll(arr1);

        // get element at that index
        String val = arr.get(0);
        System.out.println(val);

        // remove element
        arr.remove(0);
        arr.remove("Let's see");

        // set the value at index
        arr.set(1, "Saptarshi");
        System.out.println(arr);

        // Set the value of arraylist
        arr.set(0, "shravni");
        System.out.println(arr);

        // Sort
        Collections.sort(arr);
        System.out.println(arr);

        // Size
        System.out.println(arr.size());

        // Check whether the element is present in the array
        System.out.println(arr.contains("Codechef"));

        // Reverse
        Collections.reverse(arr);
        System.out.println(arr);

        // Print
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        for (String ele : arr) {
            System.out.print(ele + " ");
        }

        ListIterator<String> it = arr.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println(it.previous());
            it.remove();
        }
        arr.forEach(n -> System.out.println(n));
        arr.forEach(n -> show(n));

        // Clear the arraylist
        arr.clear();

        System.out.println(arr);
    }

    static void show(String s) {
        if (s.length() > 4) {
            System.out.println(s);
        }
    }
}
