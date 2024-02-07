package mypack2;

import mypack2.Demo1;

// Same package non sub class

public class Demo2 {

    Demo1 d = new Demo1();

    public void show() {
        System.out.println(d.a + d.b + d.c + d.d);
    }
}
