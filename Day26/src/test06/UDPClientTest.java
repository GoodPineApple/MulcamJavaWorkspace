package test06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClientTest {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramSocket receiveSocket = null;
		
		try {
			sendSocket = new DatagramSocket();
			System.out.println("[�������� �޼���]");
			Scanner scan = new Scanner(System.in);
			String sendData = scan.nextLine();
			byte[] sendMsg = sendData.getBytes();
			DatagramPacket packet = new DatagramPacket(sendMsg, sendMsg.length, new InetSocketAddress("localhost", 1111));
			sendSocket.send(packet);
			System.out.println("[���ۿϷ�]");
			
			receiveSocket = new DatagramSocket();
			byte[] receiveData = new byte[256];
			System.out.println("��ٸ�����");
			DatagramPacket receivepacket = new DatagramPacket(receiveData, receiveData.length);
			receiveSocket.receive(receivepacket);
			System.out.println("[������ �亯]" + new String(receiveData));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
