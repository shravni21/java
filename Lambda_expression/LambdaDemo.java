package Lambda_expression;

@FunctionalInterface
interface Mylambda {
    public void display();
}

// class My implements Mylambda {
// public void display() {
// System.out.println("Hello World!");
// }
// }

public class LambdaDemo {
    public static void main(String[] args) {
        Mylambda m = () -> {
            System.out.println("Hello World!");
        };

        m.display();

    }
}
