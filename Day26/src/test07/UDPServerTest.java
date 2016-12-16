package test07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServerTest {

	public static void main(String[] args) {
		DatagramSocket receiveSocket = null;
		DatagramSocket sendSocket = null;
		try {
			System.out.println("[����] ��ٸ��� ��");
			receiveSocket = new DatagramSocket(1111);
			sendSocket = new DatagramSocket();
			Scanner scan = new Scanner(System.in);

			while (true) {
				byte[] receiveMsg = new byte[256];
				DatagramPacket receivePacket = new DatagramPacket(receiveMsg, receiveMsg.length);
				receiveSocket.receive(receivePacket);
				System.out.println("[" + receivePacket.getSocketAddress() + "] :" + new String(receiveMsg));

				System.out.print("[����]");
				byte[] sendMsg = new byte[256];
				String s = scan.nextLine(); 
				sendMsg = s.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendMsg, sendMsg.length, receivePacket.getAddress(), 2222);
				sendSocket.send(sendPacket);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(receiveSocket != null) {
				receiveSocket.close();
			}
			if(sendSocket != null) {
				sendSocket.close();
			}
		}

	}

}
