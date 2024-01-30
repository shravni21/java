package OOP;

class Cylinder1 {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setDimensions(double r, double h) {
        radius = r;
        height = h;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

public class Student_challenge {
    public static void main(String[] args) {
        Cylinder1 cy = new Cylinder1();
        cy.setHeight(10);
        cy.setRadius(5);
        System.out.println("The radius is: " + cy.getRadius());
        System.out.println("Height is: " + cy.getHeight());
    }
}
