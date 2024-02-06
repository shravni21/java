package Lambda_expression;

interface lambda2 {
    public void display();
}

// lambda expression can only access local variables which are final, or never
// modified again
class Demo {
    int temp = 100;

    public void method1() {
        int cnt = 10;
        lambda2 m = () -> {
            System.out.println("Hello. ");
            System.out.println("You can add multiple statements in lambda expression.");
            System.out.println(cnt + " " + temp++ + " .");
        };
        m.display();

    }

}

class UseLambda {
    public void callLambda(lambda2 l2) {
        l2.display();
    }
}

class Demo5 {
    public void meth1() {
        UseLambda u = new UseLambda();
        u.callLambda(() -> {
            System.out.println("Hello from lambda object.");
        });
    }
}

public class Capture_in_lambda_expressions {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
        Demo5 d1 = new Demo5();
        d1.meth1();
    }
}
