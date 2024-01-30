package Array;

public class Two_dimentional_array {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        int B[][] = { { 1, 2, 3, 4 }, { 1, 4, 5, 6 }, { 1, 1, 1, 1, 1 }, { 19, 8, 9, 0 } };
        int c[][];
        c = new int[5][5];
        int[] D[] = new int[5][5];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int x[] : B) {
            for (int x1 : x) {
                System.out.print(x1 + " ");
            }
            System.out.println();
        }
        System.out.println(B);
    }
}
