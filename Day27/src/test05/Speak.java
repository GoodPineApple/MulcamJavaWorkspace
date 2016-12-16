package test05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Speak extends Thread {
	private BufferedWriter bw;

	public Speak(Socket socket) {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("BufferedWriter Fail");
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("��:");
				String msg = scan.nextLine();

				bw.write(msg + '\n');
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("������ �ȵǰų� ������ �����Ͽ���");
			e.printStackTrace();

		}
		super.run();
	}

}
