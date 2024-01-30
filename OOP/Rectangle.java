package OOP;

class Rectangle1 {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean check_square() {
        return length == breadth;
    }
}

public class Rectangle {

    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        rec.length = 10.0;
        rec.breadth = 10.0;
        System.out.println("Area: " + rec.area());
        System.out.println("Perimeter " + rec.perimeter());
        System.out.println("Is it a square? " + rec.check_square());
    }
}
