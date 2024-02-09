package Collections;

import java.util.Map;
import java.util.TreeMap;

public class Treemap_collection {
    public static void main(String[] args) {
        TreeMap<Integer, Character> tm = new TreeMap<>(Map.of(0, 'A', 1, 'B', 2, 'C', 3, 'D', 4, 'E', 5, 'F'));
        // Add
        tm.put(6, 'G');
        tm.put(7, 'H');

        System.out.println(tm.ceilingEntry(5).getValue());

        // get value
        tm.get(3);

        // check if it contains element
        System.out.println(tm.containsKey(8));

        // Key value pair
        java.util.Map.Entry<Integer, Character> e = tm.firstEntry();
        System.out.println(e.getKey() + " " + e.getValue());

        System.out.println(tm);

    }
}
