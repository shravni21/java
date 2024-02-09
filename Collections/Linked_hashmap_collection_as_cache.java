package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class Linked_hashmap_collection_as_cache {
    public static void main(String[] args) {
        // In hashmap there will be only one value for each key in the table but linked
        // hashmap contains prev and next in table
        // h(x)= x%10
        // It is works as LRU
        // get, put, remove in O(1)

        // 0.75f= loading factor

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry e) {
                // you can keep your condition you want
                return size() > 5;
            }
        };

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");

        String s = lhm.get(2);
        // System.out.println(s);
        s = lhm.get(5);

        lhm.forEach((K, V) -> System.out.println(K + " " + V));

    }
}
