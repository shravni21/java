public class App {
    public static void main(String[] args) {
        vehicle racecar= new vehicle(new SmallEngine(100));
        racecar.crackIgnite();
        vehicle v1=new vehicle(new LargeEngine(500));
       v1.crackIgnite();
    }
}
