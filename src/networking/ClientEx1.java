package networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx1 {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            System.out.println("Client running...");
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            String message;

            System.out.println("Type 'exit' to disconnect.");
            
            while (true) {
                if (!socket.isConnected()) {
                    System.out.println("Server is down. Exiting...");
                    break; // Stop the loop if the server is no longer connected
                }

                System.out.print("Input message: ");
                message = sc.nextLine();
                
                // If user types 'exit', disconnect
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                try {
                    output.println("from client: " + message);
                } catch (Exception e) {
                    System.out.println("Error sending message to server: " + e.getMessage());
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Error: Unknown host. Could not connect to server.");
        } catch (IOException e) {
            System.out.println("Error: Could not establish connection to server.");
        }
    }
}
