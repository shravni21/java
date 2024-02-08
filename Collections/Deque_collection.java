package Collections;

import java.util.ArrayDeque;

public class Deque_collection {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Insert from front and rare
        dq.offer(10);
        dq.offerFirst(20);
        dq.offerLast(30);

        // Remove from front and rare
        dq.pollLast();
        dq.pollFirst();

        // Inserting elements
        dq.offerLast(40);
        dq.offerLast(60);
        dq.offerFirst(70);
        dq.offerFirst(80);

        // Front and reare elements
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq);
    }
}
