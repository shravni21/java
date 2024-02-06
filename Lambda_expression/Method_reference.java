package Lambda_expression;

import Methods.Method;

@FunctionalInterface
interface Mylambda2 {
    public void display(String str);
}

public class Method_reference {
    // you can use local static methods as well
    public static void reverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }

    public void swapping(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.charAt(0);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Mylambda2 m = System.out::println;
        // System- classname , out- object_name and returned using scope resolution
        // operator
        m.display("Hello, I am Shravni.");

        Mylambda2 m2 = Method_reference::reverse;
        m2.display("Shravni");

        // If the method is not static now refer object
        Method_reference obj = new Method_reference();
        Mylambda2 m3 = obj::swapping;
        m3.display("Shravni");
    }
}
