public class Doctor extends Employee {
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor is Active.");
    }

    @Override
    public void performDuties() {
        diagnose();
        prescribe();
    }

    //Doctor
    private void diagnose() {
        System.out.println("Diagnose.");
    }

    private void prescribe() {
        System.out.println("Prescribe medicines.");
    }
}
