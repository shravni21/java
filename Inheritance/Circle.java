package Inheritance;

import OOP.Cylinder_oops;

class Circle1 {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class cylinder extends Circle1 {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class Circle {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 10;
        c.height = 20;
        System.out.println("Volume is: " + c.volume());
        System.out.println("Area is: " + c.area());
    }
}
