package test05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClientTest {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramSocket receiveSocket = null;
		
		try {
			//������ �ʿ��� Ư���� ��Ʈ��ȣ�� ������ �ʿ�� ����
			sendSocket = new DatagramSocket();
			receiveSocket = new DatagramSocket(2222);
			
			Scanner scan = new Scanner(System.in);
			String sendMsg = scan.nextLine();
			
			byte[] sendData = sendMsg.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("70.12.109.119"), 2222);
			sendSocket.send(sendPacket);
			System.out.println("���� �Ϸ�!");
			////////////////////////////////////////////////////////////////
			//Ŭ���̾�Ʈ�� ���� �޼����� ������ �� �Ŀ��� ������ ��ٸ����� �ϱ�
			byte[] receiveData = new byte[256];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("������ ��ٸ��� ��");
			receiveSocket.receive(receivePacket);
			
			System.out.println("������ ����:" + new String(receiveData));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sendSocket != null) {
				sendSocket.close();
			}
		}
	}

}