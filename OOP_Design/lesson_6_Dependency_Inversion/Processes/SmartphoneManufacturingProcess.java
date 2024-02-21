package Processes;

import Processes.GeneralManufacturingProcess;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Smartphone.");
    }

    @Override
    protected void testDevice() {
        System.out.println("Smartphone is tested.");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Smartphone is packaged.");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Smartphone is stored.");
    }
}
