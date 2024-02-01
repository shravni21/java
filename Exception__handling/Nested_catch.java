package Exception__handling;

public class Nested_catch {
    public static void main(String[] args) {

        int A[] = { 10, 20, 30, 40, 50 };
        try {
            int k = A[3] / A[0];
            System.out.println("The division of two numbers is: " + k);
            try {
                System.out.println("Sixth array element is: " + A[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Accessing the element of the array not in array.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Denominator Should not be 0");
        }

        System.out.println("exit.");
    }
}
