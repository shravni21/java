package Networking1.MultiThreaded_reverse_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.plaf.TreeUI;

public class ReverseEcho extends Thread {
    Socket stk;

    public ReverseEcho(Socket socket) {
        stk = socket;
    }

    public void run() {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());
            String msg;
            StringBuilder bd;
            do {
                // Read message
                msg = br.readLine();

                // Reverse the String
                bd = new StringBuilder(msg);
                bd.reverse();
                msg = bd.toString();

                // Print
                ps.println(msg);

            } while (!msg.equals("dne"));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2000);
        int cnt = 1;
        Socket stk;
        ReverseEcho re;
        do {
            stk = ss.accept();
            System.out.println("Client is Connected! " + cnt++);
            re = new ReverseEcho(stk);
            re.start();

        } while (true);

    }
}
