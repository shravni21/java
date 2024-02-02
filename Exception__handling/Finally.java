package Exception__handling;

public class Finally {

    static void meth1() throws Exception {
        try {
            throw new Exception();

        } finally {
            System.out.println("Final Message");

        }
    }

    public static void main(String[] args) {
        System.out.println(Method());
    }

    public static int Method() {
        try {
            meth1();
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        } finally {
            System.out.println("Finally block executed");
        }
    }
}