package Exception__handling;

class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimension cannot be negative or zero.";
    }
}

public class Throw_vs_throws {

    static int area(int l, int b) throws NegativeDimensionException {
        if (l <= 0 || b <= 0)
            throw new NegativeDimensionException();
        int a = l * b;
        return a;
    }

    public static void main(String[] args) {
        Throw_vs_throws th = new Throw_vs_throws();
        try {
            int k = th.area(20, -1);
            System.out.println("The area is: " + k);
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
