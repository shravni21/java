package Collections;

import java.util.*;
import java.util.Map;

public class Map_collection {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Apple", 1);
        m.put("Banana", 2);
        m.put("Dog", 4);
        m.put("Cat", 3);
        System.out.println(m);
        System.out.println(m.containsKey("Dog"));

    }
}
