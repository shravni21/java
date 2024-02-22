public class App {
    public static void main(String[] args) {
        vehicleFactory v= new vehicleFactory();
       vehicle v1= v.getvehicle("CAR");
       v1.startEngine();
    }
}
