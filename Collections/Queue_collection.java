package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_collection {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        // add element in queue at rear element
        q.offer("Shravni");
        q.offer("Harish");
        q.offer("Saie");

        // Peek
        System.out.println(q.peek());

        // Poll- to remove element
        q.poll();

        // print queue
        // System.out.println(q);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
        // Size
        System.out.println(q.size());

        // Clear
        q.clear();

    }
}
