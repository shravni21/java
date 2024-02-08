package Collections;

import java.util.*;

public class Set_collection {
    public static void main(String[] args) {

        // Maintained in any order
        Set<Integer> s = new HashSet<>();

        // If you want the elements in sorted order
        // Set<Integer> s = new HashSet<>();

        // Add element in set
        s.add(12);
        s.add(13);
        s.add(14);
        s.add(15);
        s.add(14);
        System.out.println(s);

        // remove
        s.remove(14);
        System.out.println(s);

        // Contains
        System.out.println(s.contains(12));

        // isempty
        System.out.println(s.isEmpty());

        // size
        System.out.println(s.size());
        // clear
        s.clear();

    }
}
