package OOP;

class Rectangle2 {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return getLength() * getBreadth();
    }

    public double perimeter() {
        return 2 * (getLength() + getBreadth());
    }

    public boolean check_square() {
        return getLength() == getBreadth();
    }
}

public class Data_hiding {
    public static void main(String[] args) {
        Rectangle2 rec = new Rectangle2();
        rec.setLength(10.2d);
        rec.setBreadth(12.7);

        System.out.println("Area: " + rec.area());
        System.out.println("Perimeter: " + rec.perimeter());
        System.out.println("Is it a square? " + rec.check_square());
        System.out.println("Length: " + rec.getLength());
        System.out.println("Breadth: " + rec.getBreadth());

    }
}
