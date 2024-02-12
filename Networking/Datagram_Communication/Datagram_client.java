package Networking1.Datagram_Communication;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Datagram_client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello World!";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2000);

        // Sending the package to the server
        ds.send(dp);

        byte b[] = new byte[1024];
        dp = new DatagramPacket(b, 1024);
        ds.receive(dp);

        msg = new String(dp.getData()).trim();
        System.out.println("From Server: " + msg);

        ds.close();
    }
}
