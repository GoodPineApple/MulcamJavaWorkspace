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
			receiveSocket = new DatagramSocket(1111); //1111 포트 점유
			sendSocket = new DatagramSocket();
			byte[] receiveData = new byte[256];
			//비어있는 패킷을 만들어서 데이터가 도착하면 담기도록 함.
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("기다리는중...");
			//빈 패킷을 가지고 소켓에서 기다림.
			receiveSocket.receive(receivePacket);
			
			System.out.println("받았다.");
			System.out.println("클라이언트:" + new String (receiveData));
			//////////////////////////////////////////////////////////////////////////////////
			Scanner scan = new Scanner(System.in);
			System.out.println("서버답장>>");
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
