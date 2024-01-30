package Conditionalstatements;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter domain name:");
        String s = sc.next();
        String temp = s.substring(s.lastIndexOf(".") + 1);
        switch (temp) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
            default:
                System.out.println("Unknown domain");
                break;
        }
    }

}
