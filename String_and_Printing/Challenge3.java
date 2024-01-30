package String_and_Printing;

// Remove Special characters from the String
// Remove Extra spaces from ths String
// Find the number of words from the string
import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();

        s = s.replaceAll("\\s+", " ").trim();
        System.out.println("Extra space removed" + s);

        String words[] = s.split("\\s");
        System.out.println("Total Words are: " + words.length);
        // for (int i = 0; i < words.length; i++) {
        // System.out.println(words[i]);
        // }

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Special characters removed" + s);

        sc.close();
    }

}