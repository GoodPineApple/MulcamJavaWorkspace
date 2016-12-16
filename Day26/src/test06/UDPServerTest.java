package test06;

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
			System.out.println("[서버] 기다리는 중");
			receiveSocket = new DatagramSocket(1111);
			sendSocket = new DatagramSocket();
			
			byte[] receiveMsg = new byte [256];
			DatagramPacket receivePacket = new DatagramPacket(receiveMsg, receiveMsg.length);
			receiveSocket.receive(receivePacket);
			System.out.println("[" + receivePacket.getSocketAddress() + "] :" + new String(receiveMsg));
			
			System.out.print("[서버]");
			byte[] sendMsg = new byte[256];
			Scanner scan = new Scanner(System.in);
			sendMsg = scan.nextLine().getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendMsg, sendMsg.length);
			sendSocket.send(sendPacket);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
