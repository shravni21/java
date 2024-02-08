package Collections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist_collection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        LinkedList<Integer> ll1 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        ll.addAll(ll1);

        // print
        ll.forEach(n -> show(n));

        // add last
        ll.addLast(100);

        // add first
        ll.addFirst(-1);

    }

    static void show(Integer n) {
        System.out.println(n);
    }
}
