package test05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChattingServer {
	public static void main(String[] args) {
		
		
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("Server Wait...");
			Socket socket = serverSocket.accept();
			System.out.println("Connet!");
			
			new Speak(socket).start();
			new Listen(socket).start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
