package Conditionalstatements;

// Find the type of website and protocol is used
import java.util.Scanner;

public class Challenge3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL:");
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http"))
            System.out.println("This is Hypertext transfer protocol");
        else if (protocol.equals("https"))
            System.out.println("Hypertext Transfer Protocol Secure");
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        else
            System.out.println("Oops, I don't know.");

        String extension = url.substring(url.lastIndexOf(".") + 1);
        if (extension.contentEquals("com"))
            System.out.println("Commercial");
        else if (extension.contentEquals("org"))
            System.out.println("Organization");
        else if (extension.contentEquals("gov"))
            System.out.println("Government");
        else if (extension.contentEquals("net"))
            System.out.println("Network");
        else
            System.out.println("Something went wrong!");

        sc.close();
    }

}