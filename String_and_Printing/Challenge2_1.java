package String_and_Printing;

// Find the data is in Date format (dd/mm/yyyy)
import java.util.Scanner;

public class Challenge2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date: ");
        String date;
        date = sc.nextLine();
        if (date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}")) {
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }
        sc.close();
    }

}
