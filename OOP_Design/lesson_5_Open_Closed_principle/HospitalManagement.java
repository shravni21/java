import javax.print.Doc;

public class HospitalManagement {
    public void Callupon(Employee e) {

//        if (e instanceof Nurse) {
//            CheckVitalsigns();
//            drawBlood();
//            cleanPatientArea();
//        } else if (e instanceof Doctor) {
//            diagnose();
//            prescribe();
//        }

        e.performDuties();

    }

//    //Nurses
//    private void CheckVitalsigns() {
//        System.out.println("Checking Vitals.");
//    }
//
//    private void drawBlood() {
//        System.out.println("Drawing blood");
//    }
//
//    private void cleanPatientArea() {
//        System.out.println("Cleaning patient area.");
//    }

//    //Doctor
//    private void diagnose() {
//        System.out.println("Diagnose.");
//    }
//
//    private void prescribe() {
//        System.out.println("Prescribe medicines.");
//    }
}
