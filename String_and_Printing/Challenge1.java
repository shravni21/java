package String_and_Printing;

// Find if email id is on gmail or not
// find username and domain name from email

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email ID: ");
        String s = sc.nextLine();
        int i = s.indexOf("@");
        String username = s.substring(0, i);
        String domain = s.substring(i + 1, s.length());
        System.out.println("Domain is: " + domain);
        if (domain.contentEquals("gmail.com"))
            System.out.println("Yes, email id is on gmail.");
        else
            System.out.println("No, Email id is not present on gmail.");

        System.out.println("Username: " + username);

        sc.close();
    }

}