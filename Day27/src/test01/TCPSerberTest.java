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
			// TCP��ſ����� ������ Ư�� ��Ʈ�� �����ϰ� ���� ����Ǽ� ��ٸ��� ����.
			ServerSocket serverSocket = new ServerSocket(5555);

			System.out.println("Server Wait...");
			Socket socket = serverSocket.accept();
			System.out.println("Client ������"); // ��������
			//////////////////////////////////////////////////////////////////////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			Scanner scan = new Scanner(System.in);
			while (true) {
				// Ŭ���̾�Ʈ�� ������ ���� ������ ���Ŵ��
				String receiveMsg = br.readLine();
				System.out.println("����:" + receiveMsg);

				String sending = scan.nextLine();

				bw.write(sending + '\n');
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("Client ���� ����");
			// e.printStackTrace();
		}

	}

}
