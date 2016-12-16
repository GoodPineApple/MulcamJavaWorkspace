package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("70.12.109.120", 9717);
			Scanner scan = new Scanner(System.in);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				System.out.print("�߾�:");
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
