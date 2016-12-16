package test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("70.12.109.120"), 5555);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("�������� ������ �޼��� �Է�>>");
				String sending = scan.nextLine();

				bw.write(sending + '\n');
				bw.flush(); // Buffered �� ���� �Բ� ��. �������.
///////////////////////////////////////////////////////////////////////////////////////////////////
				//���
				String receiveMsg = br.readLine();
				System.out.println("����:" + receiveMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
