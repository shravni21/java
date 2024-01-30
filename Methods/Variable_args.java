package Methods;

public class Variable_args {
    static void show(int... A) {
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void showList(int start, String... s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(start + ". " + s[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        show(10, 23, 90);
        showList(5, "Shravni", "Manoj", "Pankaj", "Sharvari");
    }
}
