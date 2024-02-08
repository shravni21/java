package Collections;

import java.util.*;

public class Stack_collection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // Push
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        // Pop
        s.pop();

        // Print
        System.out.println(s);

        // Peek
        System.out.println(s.peek());

        // empty
        System.out.println(s.isEmpty());

        // Print, peek= top
        while (s.isEmpty() != true) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        // clear
        s.clear();
    }
}
