
import java.lang.*;
import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        System.out.println("Enter length, breadth and height of room");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        int volume = length * breadth * height;
        int total_surface_area = 2 * (length * breadth + breadth * height + length * height);
        System.out
                .println("The volume of the cuboid is: " + volume);
        System.out.println("Total surface area is: " + total_surface_area);
    }

}
