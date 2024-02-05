package Practice;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a.toLowerCase();
        b.toLowerCase();
        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        } else {
            char temp1[] = a.toCharArray();
            char temp2[] = b.toCharArray();
            int freq[] = new int[26];
            for (char it : temp1) {
                freq[it - 'a']++;
            }
            for (char it : temp2) {
                freq[it - 'a']--;
            }
            boolean flag = true;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] != 0) {
                    flag = false;
                }
            }
            if (flag == false) {
                System.out.println("Not Anagrams");
            } else
                System.out.println("Anagrams");
            System.out.println();
        }
    }
}