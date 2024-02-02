package Multithreading;

class Mydata1 {
    int val;
    boolean flag = true;

    synchronized public void set(int va) {
        while (flag != true)
            try {
                wait();
            } catch (InterruptedException e) {

                System.out.println(e);
            }
        val = va;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag != false)
            try {
                wait();
            } catch (InterruptedException e) {

                System.out.println(e);
            }
        x = val;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    Mydata1 data;

    public Producer(Mydata1 d) {
        data = d;
    }

    public void run() {
        int cnt = 1;
        while (true) {
            data.set(cnt);
            System.out.println("Producer: " + cnt);
            cnt++;
        }
    }
}

class Consumer extends Thread {
    Mydata1 data;

    public Consumer(Mydata1 d) {
        data = d;
    }

    public void run() {
        int value;
        while (true) {
            value = data.get();
            System.out.println("Consumer: " + value);
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Mydata1 data = new Mydata1();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}
