package Multithreading;

class Mythread extends Thread {

    // in this run is the starting point of thread.
    // you have to override the run method.
    // start is builtin

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class Multithreading_in_java1 {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        int j = 1;
        while (true) {
            System.out.println(j + "World");
            j++;
        }
    }
}
