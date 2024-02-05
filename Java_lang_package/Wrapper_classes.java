package Java_lang_package;

public class Wrapper_classes {
    public static void main(String[] args) {
        Integer in = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("12");
        byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Short sh = Short.valueOf("122");

        Float f = 12.4f;
        // Float g = Float.valueOf("12.4");
        float cc = 12.3f;
        Float h = Float.valueOf(cc);

        Double i = Double.valueOf(123.345);

        Character ch = Character.valueOf('A');

        Boolean j = Boolean.valueOf("true");

        Float g = Float.valueOf("12.4"); // here g is float type of object.
        float x = g.floatValue(); // here you get a primitive value like unboxing.
        float y = g;

        // Boxing ---> getting premitive from object
        int k = 13;
        Integer l = k; // auto boxing
        Integer m = Integer.valueOf(k);

        int n = m.intValue(); // Unboxing -----> primitive assigned to object

        // Integer classes:
        int m1 = 15;
        Integer m2 = m1;
        Integer m3 = 15;
        // System.out.println(m2.equals(m1));
        // System.out.println(m2.equals(m3));

        Integer m4 = Integer.valueOf("1010", 2);
        Integer m5 = Integer.valueOf("A07", 16);
        Integer m6 = Integer.decode("0xA7");
        // System.out.println(m6);
        // System.out.println(Integer.toBinaryString(12));

        // Float character and boolean classes
        System.out.println(g.NaN);

    }
}
