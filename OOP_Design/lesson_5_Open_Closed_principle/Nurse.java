public class Nurse extends Employee {
    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse is active....");
    }

    @Override
    public void performDuties() {
        CheckVitalsigns();
        drawBlood();
        cleanPatientArea();
    }

    private void CheckVitalsigns() {
        System.out.println("Checking Vitals.");
    }

    private void drawBlood() {
        System.out.println("Drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning patient area.");
    }
}
