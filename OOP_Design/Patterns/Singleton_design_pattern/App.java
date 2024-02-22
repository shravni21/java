public class App {
    public static void main(String[] args) {
        PerformanceStage p= PerformanceStage.getInstance();
        PerformanceStage p1= new PerformanceStage();
        PerformanceStage p2= new PerformanceStage();
        PerformanceStage p3=new PerformanceStage();
        PerformanceStage p4= new PerformanceStage();
        System.out.println(p3.getCounter());
    }
}
