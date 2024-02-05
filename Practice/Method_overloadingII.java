package Practice;

import java.io.*;
import java.util.*;

class cycle {
    void print() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
    }
}

class child extends cycle {
    @Override
    void print() {
        super.print();
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }

}

public class Method_overloadingII {
    public static void main(String[] args) {
        child c = new child();
        c.print();
    }
}