package Lambda_expression;

@FunctionalInterface
interface Mylambda1 {

    public int add(int x, int y);
}

// class My implements Mylambda {
// public void display() {
// System.out.println("Hello World!");
// }
// }

public class Parameters_in_lambda_interface {
    public static void main(String[] args) {
        // Mylambda1 m = (a, b) -> {
        // return a + b;
        // };
        // System.out.println(m.add(10, 200));
        Mylambda1 m = (a, b) -> a + b;
        int r = m.add(10, 20);
        System.out.println(r);

    }
}
