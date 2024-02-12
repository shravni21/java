package Networking1.Datagram_Communication;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Datagram_server {
    // we declared 2000 for server and 2001 for client
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2000);

        byte b[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, 1024);
        ds.receive(dp);

        String msg = new String(dp.getData()).trim();
        System.out.println("From Client: " + msg);

        // Reverse message
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();

        dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2001);
        ds.send(dp);
        ds.close();
    }
}
