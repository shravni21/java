package Java_lang_package;

import java.lang.*;

class Myobject {
    public String toString() {
        return "Myobject";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}

public class Object_class {
    public static void main(String[] args) {
        Myobject o1 = new Myobject();
        // o1.toString();
        System.out.println(o1.toString());
        Myobject o2 = new Myobject();
        System.out.println(o1.equals(o2));
    }
}
