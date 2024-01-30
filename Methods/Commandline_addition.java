package Methods;

public class Commandline_addition {
    public static void main(String[] args) {
        double sum = 0;
        for (String s : args) {
            // if (s.matches("[0-9\\.]+"))
            sum = sum + Double.parseDouble(s);
        }
        System.out.println(sum);
    }
}
