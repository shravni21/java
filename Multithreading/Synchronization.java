package Multithreading;

// class Mydata {
//     public void display(String str) {
//         synchronized (this) {
//             for (int i = 0; i < str.length(); i++) {
//                 System.out.print(str.charAt(i));
//             }
//         }
//     }
// }
class Mydata {
    synchronized public void display(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class Mythread3 extends Thread {
    Mydata d;

    public Mythread3(Mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello World! ");
    }
}

class Mythread4 extends Thread {
    Mydata d;

    public Mythread4(Mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("Welcome All! ");
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Mydata d = new Mydata();
        Mythread3 t1 = new Mythread3(d);
        Mythread4 t2 = new Mythread4(d);
        t1.start();
        t2.start();
    }
}
