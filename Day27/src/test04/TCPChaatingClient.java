package test04;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class TCPChaatingClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("70.12.109.120"),9999);
			System.out.println("Connect");
			
			new Speak(socket).start();
			new Listen(socket).start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
