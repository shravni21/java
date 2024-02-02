package Multithreading;

public class Multithreading_in_java2 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Multithreading_in_java2 t = new Multithreading_in_java2();
        t.start();
        int j = 1;
        while (true) {
            System.out.println(j + "World");
            j++;
        }
    }
}
