package Networking1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;

        try {
            // Create a server socket
            serverSocket = new ServerSocket(2000);
            System.out.println("Server started. Waiting for clients...");

            // Accept client connections
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);

            // Initialize input and output streams
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintStream ps = new PrintStream(clientSocket.getOutputStream());

            String message;
            do {
                // Read message from client
                message = br.readLine();

                // Reverse the message
                StringBuilder reversedMessage = new StringBuilder(message).reverse();

                // Send reversed message back to client
                ps.println(reversedMessage);

            } while (!message.equals("dne"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}
