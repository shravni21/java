package OOP;

import java.util.Scanner;

// properties: radius, height
// methods: lidarea, total surface area, volume
class Cylinder {

    public double radius, height;

    public double lid_area() {
        return Math.PI * radius * radius;

    }

    public double total_surface_area() {
        return 2 * Math.PI * radius * (radius * height);

    }

    public double volume() {
        return Math.PI * radius * radius * height;

    }
}

public class Cylinder_oops {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height of a cylinder: ");
        c.radius = sc.nextDouble();
        c.height = sc.nextDouble();
        System.out.println("The area of lid is: " + c.lid_area());
        System.out.println("The Total surface area of the cylinder is: " + c.total_surface_area());
        System.out.println("The volume of the cylinder is: " + c.volume());

    }
}
