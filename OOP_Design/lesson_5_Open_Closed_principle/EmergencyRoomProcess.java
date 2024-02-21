public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();
        Employee dhriti = new Nurse(1, "Dhriti", "emergency", true);
        Employee suzen = new Doctor(2, "Suzen", "emergency", true);
        ERDirector.Callupon(dhriti);
        ERDirector.Callupon(suzen);
    }
}
