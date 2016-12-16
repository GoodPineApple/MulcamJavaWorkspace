package test05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServerTest {
	public static void main(String[] args) {
		DatagramSocket receiveSocket = null;
		DatagramSocket sendSocket = null;
		try {
			receiveSocket = new DatagramSocket(1111); //1111 ��Ʈ ����
			sendSocket = new DatagramSocket();
			byte[] receiveData = new byte[256];
			//����ִ� ��Ŷ�� ���� �����Ͱ� �����ϸ� ��⵵�� ��.
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("��ٸ�����...");
			//�� ��Ŷ�� ������ ���Ͽ��� ��ٸ�.
			receiveSocket.receive(receivePacket);
			
			System.out.println("�޾Ҵ�.");
			System.out.println("Ŭ���̾�Ʈ:" + new String (receiveData));
			//////////////////////////////////////////////////////////////////////////////////
			Scanner scan = new Scanner(System.in);
			System.out.println("��������>>");
			String sendMsg = scan.nextLine();
			byte[] sendData = sendMsg.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("70.12.109.119"), 1111);
			sendSocket.send(sendPacket);
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
