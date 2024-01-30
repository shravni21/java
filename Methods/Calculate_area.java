package Methods;

public class Calculate_area {
    static int area(int length, int breadth) {
        return length * breadth;
    }

    static int area(int side) {
        return side * side;
    }

    static int area(int a, int b, int h) {
        return (a + b) * h / 2;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle is: " + area(10, 15));
        System.out.println("Area of Square is: " + area(10));
        System.out.println("Area of trapazium is: " + area(10, 15, 8));
    }

}
