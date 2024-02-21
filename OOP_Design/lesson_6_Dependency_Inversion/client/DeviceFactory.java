package client;

import Processes.GeneralManufacturingProcess;
import Processes.LaptopManufacturingProcess;
import Processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone");
        manufacturer.launchProcess();
    }
}
