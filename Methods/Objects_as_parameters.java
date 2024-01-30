package Methods;

public class Objects_as_parameters {
    static void solve(int a[], int ele, int i) {
        a[i] = ele;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        solve(a, 6, 2);
        for (int x : a) {
            System.out.print(x + " ");
        }

    }
}
