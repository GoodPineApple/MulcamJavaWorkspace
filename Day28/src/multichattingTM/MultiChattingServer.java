package multichattingTM;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//서버는 클라이언트의 수만큼 쓰레드를 리스트에 유지하고
//클라이언트가 추가 될때마다 소켓을 생성하여 쓰레드에게 전달함.
public class MultiChattingServer {
	private ServerSocket serverSocket;
	private List<ChattingThread> threadList;

	// 서버 생성자
	public MultiChattingServer() {
		try {
			serverSocket = new ServerSocket(1234);
			while (true) {
				System.out.println("클라이언트 기다리는 중...");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트 접속함" + socket.getInetAddress());

				// 새로운 클라이언트 접속하면 새로운 쓰레드 객체를 생성하여 리스트에 추가함.
				threadList.add(new ChattingThread(socket));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 서버의 리스트에 있는 모든 쓰레드에게 메시지 방송
	public void broadCast(String msg) {
		for (ChattingThread t : threadList) {
			t.speak(msg);
		}
	}

	// 쓰레드 객체에서 특정 쓰레드 삭제하기
	public void removeThread(ChattingThread t) {
		threadList.remove(t);
	}

	// 하나의 클라이언트가 접속했을 때 담당 쓰레드 클래스
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
					broadCast("[" + nickname + "]님이 입장하셨습니다.");
					while (true) {
						msg = br.readLine();
						broadCast(nickname + ":" + msg);
					}
				} catch (IOException e) {
					// 담당 클라이언트가 퇴장했을 때
					removeThread(this);
					broadCast("[" + nickname + "]님이 퇴장하셨습니다.");
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
