package Multithreading;

public class Multithreading_using_runnable_interface2 implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello.");
            i++;
        }
    }

    public static void main(String[] args) {
        Multithreading_using_runnable_interface2 i = new Multithreading_using_runnable_interface2();
        Thread t = new Thread(i);
        t.start();
        int j = 1;
        while (true) {
            System.out.println(j + "World");
            j++;
        }
    }

}
