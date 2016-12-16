package test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Listen extends Thread {
	private BufferedReader br;

	public Listen(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		} catch (IOException e) {
			System.out.println("Buffered Reader Fail");
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				String receiveMsg = br.readLine();
				System.out.print("상대방:" + receiveMsg);
			}
		} catch (IOException e) {
			System.out.println("상대방 퇴장 Listen 종료");
			e.printStackTrace();
		}
		super.run();
	}

}
