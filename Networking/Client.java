package Networking1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket clientSocket = null;

        try {
            // Connect to the server
            clientSocket = new Socket("localhost", 2000);
            System.out.println("Connected to server.");

            // Initialize io streams
            BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintStream ps = new PrintStream(clientSocket.getOutputStream());

            String message;
            do {
                // Read message from keyboard
                System.out.print("Enter message: ");
                message = keyboardInput.readLine();

                // Send message to server
                ps.println(message);

                // response from server
                String serverResponse = serverInput.readLine();
                System.out.println("Server response: " + serverResponse);

            } while (!message.equals("dne"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (clientSocket != null) {
                clientSocket.close();
            }
        }
    }
}
