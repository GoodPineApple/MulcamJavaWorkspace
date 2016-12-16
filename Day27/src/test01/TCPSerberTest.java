package test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPSerberTest {

	public static void main(String[] args) {
		try {
			// TCP통신에서는 서버가 특정 포트를 점유하고 먼저 실행되서 기다리고 있음.
			ServerSocket serverSocket = new ServerSocket(5555);

			System.out.println("Server Wait...");
			Socket socket = serverSocket.accept();
			System.out.println("Client 접속함"); // 서버역할
			//////////////////////////////////////////////////////////////////////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			Scanner scan = new Scanner(System.in);
			while (true) {
				// 클라이언트가 보내는 문장 한줄을 수신대기
				String receiveMsg = br.readLine();
				System.out.println("받음:" + receiveMsg);

				String sending = scan.nextLine();

				bw.write(sending + '\n');
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("Client 접속 종료");
			// e.printStackTrace();
		}

	}

}
