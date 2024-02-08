package Generics;

public class GenericDemo {
    public static void main(String[] args) {

        // Class Object:
        // Object obj = new String("Hello!");
        // String str = (String) obj;
        // System.out.println(str);

        // Array of Object:(gets an error at integer)
        Object obj[] = new Object[3];
        obj[0] = "Hi";
        obj[1] = "Shravni";
        obj[2] = new Integer(10);
        String str;
        for (int i = 0; i < 3; i++) {
            str = (String) obj[i];
            System.out.println(str);
        }

    }
}
