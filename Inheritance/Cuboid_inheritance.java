package Inheritance;

class Rectangle {
    public int length;
    public int breadth;

    Rectangle() {
        length = breadth = 1;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

}

class Cuboid extends Rectangle {
    int height;

    Cuboid() {
        height = 1;
    }

    Cuboid(int height) {
        this.height = height;
    }

    Cuboid(int l, int b, int height) {
        super(l, b);
        this.height = height;
    }

    int volume() {
        return height * length * breadth;
    }

}

public class Cuboid_inheritance {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(12, 14, 10);

        System.out.println(c.volume());

    }
}
