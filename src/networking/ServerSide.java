package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerSide {
	public static List<PrintWriter>clientData=new ArrayList<PrintWriter>();
public static void main(String[] args) throws IOException {
	
	try(ServerSocket serverSocket=new ServerSocket(2000)){
		while(true) {
			 System.out.println("Server is running on port 1234... Waiting for clients...");
			Socket accept = serverSocket.accept();
			 System.out.println("Client Connected");
			
			BufferedReader input=new BufferedReader(new InputStreamReader(accept.getInputStream()));
		PrintWriter output=new PrintWriter(accept.getOutputStream(),true);
		
		synchronized (clientData) {
			clientData.add(output);
		}
		new HandlingClients(accept, input, output).start();
		}
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
