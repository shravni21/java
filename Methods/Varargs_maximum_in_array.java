package Methods;

public class Varargs_maximum_in_array {
    static int find_max(int... x) {
        int maxi = -1;
        for (int a : x) {
            if (a > maxi)
                maxi = a;
        }
        return maxi;
    }

    public static void main(String[] args) {
        System.out.println(find_max(1, 2, 4, 5, 6, 7, 8));
    }
}
