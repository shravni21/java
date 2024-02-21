public class SchoolStaff {
    private String name;
   private void makeAnnouncements(){
       System.out.println("Announce the notices.");
    }
    private void takeAttendance(){
        System.out.println("Take attendance.");

    }
    private void collectPaperWork() {
        System.out.println("Collect paper work.");
    }
    private void conductHallwayDuties(){
        System.out.println("Conduct hallway duties.");
    }
    public  void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendance();
        collectPaperWork();
        conductHallwayDuties();
        performOtherResponsibilities();
    }


}
