package Multithreading;

class My implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello.");
            i++;
        }
    }
}

public class Multithreading_using_runnable_interface1 {
    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int j = 1;
        while (true) {
            System.out.println(j + "World");
            j++;
        }
    }

}
