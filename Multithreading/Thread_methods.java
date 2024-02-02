package Multithreading;

// class MyRun implements Runnable {
//     public void run() {

//     }
// }
class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
        // setPriority(Thread.MAX_PRIORITY + 2);
    }

    public void run() {
        int cnt = 1;

        while (true) {
            System.out.println(cnt++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
                // e.printStackTrace();
            }
        }
        // System.out.println("Thread " + this.getName() + " is running");
    }
}

public class Thread_methods {
    public static void main(String[] args) {

        // Thread t1 = new Thread(new MyRun());
        // Thread t2 = new Thread("Myname");
        // Thread t = new Thread(new MyRun(), "MyName");
        MyThread1 t = new MyThread1("Mythread1");
        t.start();
        System.out.println("Id: " + t.getId());
        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("State:" + t.getState());
        System.out.println("Alive or not? " + t.isAlive());
        t.interrupt();
    }
}
