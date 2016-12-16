package test03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest extends Thread{
	public static void main(String[] args)  {
		try {
			ServerSocket server = new ServerSocket(9717);
			System.out.println("����� �ٴ� �۴���");
			Socket socket = server.accept();
			System.out.println("�� ����");
			Scanner scan = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
			
				String msg = scan.nextLine();
				bw.write("�߾�:" + msg +'\n');
				bw.flush();
			}

		} catch (IOException e) {
			System.out.println("�� ����");
			e.printStackTrace();
		}
	}

}
