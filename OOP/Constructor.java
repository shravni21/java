package OOP;

class Rectangle3 {
    private double length;
    private double breadth;

    public Rectangle3() {
        length = 1;
        breadth = 1;
    }

    public Rectangle3(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle3(double s) {
        length = s;
        breadth = s;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle3 r = new Rectangle3(10, 10);

    }
}
