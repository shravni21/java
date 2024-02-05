package Practice;

import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int res = n;
        int div = n / 2;
        while (div > 0) {
            if (n % div == 0) {
                res += div;
            }
            div--;
        }
        return res;
    }
}

public class Interface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the input: ");
        System.out.println("I implemented: AdvancedArithmetic");
        int n = sc.nextInt();
        MyCalculator my = new MyCalculator();
        System.out.println(my.divisor_sum(n));

    }
}