package Java_io_streams;

import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int cnt = 1;

        while (true) {
            try {
                os.write(cnt);
                os.flush();
                System.out.println("Producer: " + cnt);
                System.out.flush();
                cnt++;
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream in;

    public Consumer(InputStream i) {
        in = i;
    }

    public void run() {
        int x;

        while (true) {
            try {
                x = in.read();
                System.out.println("Consumer: " + x);
                System.out.flush();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Piped_stream {
    public static void main(String[] args) throws IOException {
        PipedInputStream pi = new PipedInputStream();
        PipedOutputStream po = new PipedOutputStream();
        // pi.connect(po);
        po.connect(pi);
        Producer p = new Producer(po);
        Consumer c = new Consumer(pi);
        p.start();
        c.start();
    }
}
