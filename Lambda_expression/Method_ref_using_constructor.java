package Lambda_expression;

// it is like we are achieving polymorphism

interface Mylambda3 {
    public void display(String s);
}

interface Mylambda4 {
    public int display(String s, String s1);
}

public class Method_ref_using_constructor {
    public Method_ref_using_constructor(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        Mylambda3 m = Method_ref_using_constructor::new;
        m.display("shravni");
        Mylambda4 m1 = String::compareTo;
        System.out.println(m1.display("First", "First"));
    }
}
