public class vehicle {
    Engine myEngine;
//    Tire tire;  ----- can add these objects too
//    WindShield w;
//    Roof rf;
    public vehicle(Engine anEngine){
        myEngine= anEngine;
    }
    public void crackIgnite(){
        myEngine.startEngine();
        System.out.println("Vehicle is running.");
    }
}
