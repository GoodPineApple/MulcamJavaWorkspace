package multichattingTM;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//������ Ŭ���̾�Ʈ�� ����ŭ �����带 ����Ʈ�� �����ϰ�
//Ŭ���̾�Ʈ�� �߰� �ɶ����� ������ �����Ͽ� �����忡�� ������.
public class MultiChattingServer {
	private ServerSocket serverSocket;
	private List<ChattingThread> threadList;

	// ���� ������
	public MultiChattingServer() {
		try {
			serverSocket = new ServerSocket(1234);
			while (true) {
				System.out.println("Ŭ���̾�Ʈ ��ٸ��� ��...");
				Socket socket = serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ ������" + socket.getInetAddress());

				// ���ο� Ŭ���̾�Ʈ �����ϸ� ���ο� ������ ��ü�� �����Ͽ� ����Ʈ�� �߰���.
				threadList.add(new ChattingThread(socket));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ������ ����Ʈ�� �ִ� ��� �����忡�� �޽��� ���
	public void broadCast(String msg) {
		for (ChattingThread t : threadList) {
			t.speak(msg);
		}
	}

	// ������ ��ü���� Ư�� ������ �����ϱ�
	public void removeThread(ChattingThread t) {
		threadList.remove(t);
	}

	// �ϳ��� Ŭ���̾�Ʈ�� �������� �� ��� ������ Ŭ����
	class ChattingThread extends Thread {
		private String nickname;
		private BufferedReader br;
		private BufferedWriter bw;

		public ChattingThread(Socket socket) {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			while (true) {
				String msg;
				try {
					nickname = br.readLine();
					broadCast("[" + nickname + "]���� �����ϼ̽��ϴ�.");
					while (true) {
						msg = br.readLine();
						broadCast(nickname + ":" + msg);
					}
				} catch (IOException e) {
					// ��� Ŭ���̾�Ʈ�� �������� ��
					removeThread(this);
					broadCast("[" + nickname + "]���� �����ϼ̽��ϴ�.");
					e.printStackTrace();
				}
			}
		}

		public void speak(String msg) {
			try {
				bw.write(msg + '\n');
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MultiChattingServer server = new MultiChattingServer();
	}
}
