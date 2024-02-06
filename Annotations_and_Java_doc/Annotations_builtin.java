package Annotations_and_Java_doc;

import java.util.*;

class test {
    public void display() {
        System.out.println("Hello!");
    }

    @Deprecated
    public void show() {
        System.out.println("Hi");
    }

}

class test1 extends test {
    @Override
    public void display() {
        System.out.println("Hello from child!");
    }
}

class My<T> {
    @SafeVarargs
    private void show(T... arg) {
        for (T x : arg) {
            System.out.println(x);
        }
    }
}

@FunctionalInterface
interface inter {
    public void show();
}

public class Annotations_builtin {
    @SuppressWarnings("rawtypes")
    static List l;

    @SuppressWarnings("unchecked")
    @suppresswarnings("Deprication")
    public static void main(String[] args) {
        l.add(10);
        test t = new test();
        t.show();
    }
}
