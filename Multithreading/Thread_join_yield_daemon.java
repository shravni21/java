package Multithreading;

class Mythread2 extends Thread {
    public void run() {
        int cnt = 1;
        while (true) {
            System.out.println(cnt++ + "Mythread2");
        }
    }
}

public class Thread_join_yield_daemon {
    public static void main(String[] args) {
        Mythread2 t = new Mythread2();
        t.setDaemon(true);
        t.start();

        // Daemon ends the thread as main ends
        // try {
        // Thread.sleep(100);
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // join
        // Thread mainThread = Thread.currentThread();
        // try {
        // mainThread.join();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        // Yield
        int cnt = 1;
        while (true) {
            System.out.println(cnt++ + "Main");
            // Thread.yield();
        }
    }
}
