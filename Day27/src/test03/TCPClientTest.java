package test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
	
class Reading extends Thread {
	@Override
	public void run() {
		
		super.run();
	}
}

class Writing extends Thread {
	@Override
	public void run() {

		super.run();
	}
}

public class TCPClientTest {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("local host"), 9717);
			Scanner scan = new Scanner(System.in);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			Thread reading = new Reading();
			
			while (true) {
				System.out.print("¹ß¾ð:");
				String msg = scan.nextLine();
				bw.write(msg + '\n');
				bw.flush();
				
				System.out.println(br.readLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
