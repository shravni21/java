package Abstract_class;

abstract class Shape {
    Shape() {
        System.out.println("Constructor called.");
    }

    abstract double perimeter();

    abstract double area();

}

class circle extends Shape {
    private double radius;

    circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    @Override
    double perimeter() {
        double peri = 2 * Math.PI * getRadius();
        return peri;
    }

    @Override
    double area() {
        double a = Math.PI * getRadius() * getRadius();
        return a;
    }
}

class Rectangle extends Shape {
    private double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getLength() {
        return length;
    }

    double getBreadth() {
        return breadth;
    }

    @Override
    double perimeter() {
        double peri = 2 * (getBreadth() + getLength());
        return peri;
    }

    @Override
    double area() {
        double a = getBreadth() * getLength();
        return a;
    }
}

public class Student_challenge {
    public static void main(String[] args) {
        Shape r = new Rectangle(8, 10);
        System.out.println("Area of rectangle is: " + r.area());
        System.out.println("Perimeter of rectangle is: " + r.perimeter());
        Shape s = new circle(10);
        System.out.println("Area of circle is: " + s.area());
        System.out.println("Perimeter of circle is: " + s.perimeter());

    }
}
