package multichattingTM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientFrame extends JFrame {
	// GUI 맴버
	private JPanel panelArea;
	private JPanel panelInput;
	private JTextArea chatArea;
	private JTextField chatField;
	private JButton btnSend;

	// TCP 통신 맴버
	private BufferedReader br;
	private BufferedWriter bw;

	// 생성자에서 초기작업
	public ClientFrame() {
		// GUI 초기화 부문
		panelArea = new JPanel();
		panelInput = new JPanel();
		chatArea = new JTextArea();
		chatArea.setEditable(false);
		chatField = new JTextField();
		btnSend = new JButton("전송");

		ChattingListener listener = new ChattingListener();// 이벤트 처리기(서버에게 메세지 보내는 작업) 등록
		chatField.addActionListener(listener);
		btnSend.addActionListener(listener);

		panelArea.setLayout(new BorderLayout());
		panelArea.add(new JScrollPane(chatArea));

		panelInput.setLayout(new BorderLayout());
		panelInput.add(chatField);
		panelInput.add(btnSend, BorderLayout.EAST);
		
		add(panelArea, BorderLayout.CENTER);
		add(panelInput, BorderLayout.SOUTH);

		setTitle("다중채팅 클라이언트 프레임");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 그래픽 관련
		setVisible(true);
		////////////////////////////////////////////////////////////////////////////////////////////
		// 서버와의 통신을 위한 네트워크 설정 부분
		try {
			Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 서버와 연결한 후에 닉네임을 입력해서 전송하기
			String nickName = JOptionPane.showInputDialog(this, "대화명 입력하세요.", JOptionPane.INFORMATION_MESSAGE);
			bw.write(nickName + '\n');
			bw.flush();

			// 닉네임 전송 후에는 서버가 보내는 메세지 받는 쓰레드
			new ListenThread().start();
		} catch (IOException e) {
			System.out.println("연결할 수 없음");
			e.printStackTrace();
		}
	}

	// 이벤트 처리 클래스(채팅내용 서버에게 보내기)
	class ChattingListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String msg = chatField.getText();

			try {
				while (true) {
					bw.write(msg + '\n');
					bw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 서버로부터 메세지를 받는 내부 쓰레드 클래스
	class ListenThread extends Thread {
		@Override
		public void run() {
			try {
				String receiveMsg = br.readLine();
				chatArea.append(receiveMsg + '\n');
			} catch (IOException e) {
				e.printStackTrace();
			}
			super.run();
		}
	}

	public static void main(String[] args) {
		ClientFrame cf = new ClientFrame();
	}
}
