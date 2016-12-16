package test07;

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
		Scanner scan = new Scanner(System.in);

		try {
			sendSocket = new DatagramSocket();
			receiveSocket = new DatagramSocket(2222);
			while (true) {
				System.out.println("[�������� �޼���]");
				String sendData = scan.nextLine();
				byte[] sendMsg = sendData.getBytes();
				DatagramPacket packet = new DatagramPacket(sendMsg, sendMsg.length,
						new InetSocketAddress("localhost", 1111));
				sendSocket.send(packet);
				System.out.println("[���ۿϷ�]");

				byte[] receiveData = new byte[256];
				System.out.println("��ٸ�����");
				DatagramPacket receivepacket = new DatagramPacket(receiveData, receiveData.length, receiveSocket.getLocalAddress(), 2);
				receiveSocket.receive(receivepacket);
				System.out.println("[������ �亯]" + new String(receiveData));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(receiveSocket != null) {
				receiveSocket.close();
			}
			if(sendSocket != null) {
				sendSocket.close();
			}
		}

	}

}
