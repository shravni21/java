public class PerformanceStage {


    private static PerformanceStage Instance = null;
    private int cnt = 0;

    //private constructor for singleton
   public PerformanceStage() {
        cnt++;
    }

    public synchronized static PerformanceStage getInstance() {
        if (Instance == null) {
            Instance = new PerformanceStage();
        }
        return Instance;
    }

    public void TurnonLight() {
        System.out.println("Turned on light.");
    }
    public int getCounter(){
        return cnt;
    }
}
