package Generics;

public class Generic<T> {
    T data[] = (T[]) new Object[3];

    // T---- you can declare any type
    public static void main(String[] args) {
        Generic<String> gd = new Generic();
        gd.data[0] = "Hi";
        gd.data[1] = "Hello";

        String str = gd.data[0];
        System.out.println(str);

    }
}