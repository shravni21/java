package Processes;

import Processes.GeneralManufacturingProcess;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Laptop.");
    }

    @Override
    protected void testDevice() {
        System.out.println("Laptop is tested.");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Laptop is packaged.");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Laptop is stored.");
    }
}
