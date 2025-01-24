package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class HandlingClients extends Thread{
Socket socket;
BufferedReader input;
PrintWriter output;
public HandlingClients(Socket socket, BufferedReader input, PrintWriter output) {
	super();
	this.socket = socket;
	this.input = input;
	this.output = output;
}
public void run() {
	String message;
	try {
		while((message=input.readLine())!=null) {
			System.out.println("recieved "+message);
			
			synchronized (ServerSide.clientData) {
				for(PrintWriter writer:ServerSide.clientData) {
					writer.println(message);
				}
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
        socket.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
