package Collections;

import java.util.*;

public class Priority_queue_collection {
    public static void main(String[] args) {
        // Min heap ---> will be in ascending order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(30);
        pq.offer(50);
        pq.offer(20);
        System.out.println(pq);

        // Max heap ---> will be in descending order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(10);
        pq1.offer(30);
        pq1.offer(50);
        pq1.offer(20);
        System.out.println(pq1);

        // pop
        pq.poll();

        // Methods of queue are applied here
    }
}
