package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
public static void main(String[] args) throws IOException {
	try(ServerSocket serverSocket=new ServerSocket(1234)){
		System.out.println("server running at port 1234 ");
		Socket clientSocket=serverSocket.accept();
		System.out.println("Client connected"+ clientSocket);
		String message;
		BufferedReader input=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		while((message=input.readLine())!=null) {
			System.out.println("message from client: "+message);
		}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
