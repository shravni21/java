public class vehicleFactory {
    public vehicle getvehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("truck")){
            return new Truck();
        }
        else if(vehicleType.equalsIgnoreCase("car")){
            return new Car();
        }
        else if(vehicleType.equalsIgnoreCase("electriccar")){
            return new ElectricCar();
        }
        return null;
    }
}
