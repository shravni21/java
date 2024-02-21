public class Driver {

    // Driver needs vehicle object as reference for the dependency so it comes under dependency association.
    public void drive(vehicle raceCar){
        raceCar.accelerate();
    }
}
