package test05_02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPSendExample {
	public static void main(String[] args) {
		DatagramSocket datagramSocket = null;
		System.out.println("[�߽� ����]");
		try {
			datagramSocket = new DatagramSocket();
			for(int i = 1; i<3; i++) {
				String data = "�޽���" + i;
				byte[] byteArr = data.getBytes("UTF-8");
				DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost", 5001));
				
				datagramSocket.send(packet);
				System.out.println("[���� ����Ʈ ��]:" + byteArr.length + " bytes");
			}
			
			System.out.println("[�߽� ����]");
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�߽źҰ�");
			e.printStackTrace();
		} finally {
			if(datagramSocket != null) {
				datagramSocket.close();
			}
		}
		
	}

}
