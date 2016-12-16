package practice01;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.List;

public class Server {
	ServerSocket serverSocket;
	List<Thread> threadList;
	
	public Server() {
		try {
			serverSocket = new ServerSocket(4321);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class ListenThread extends Thread {
		
	}
}
