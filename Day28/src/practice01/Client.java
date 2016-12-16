package practice01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame{
	JPanel panelArea;
	JPanel panelInput;
	JTextArea chatArea;
	JTextField chatField;
	JButton btnSend;
	
	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	
	public Client() {
		panelArea = new JPanel();
		panelInput = new JPanel();
		chatArea = new JTextArea();
		chatArea.setEditable(false);
		chatField = new JTextField();
		btnSend = new JButton("전송");
		
		ChattingListener listen = new ChattingListener();
		btnSend.addActionListener(listen);
		chatField.addActionListener(listen);
		
		panelArea.setLayout(new BorderLayout());
		panelArea.add(new JScrollPane(chatArea));
		panelInput.setLayout(new BorderLayout());
		panelInput.add(chatField);
		panelInput.add(btnSend, BorderLayout.EAST);
		
		add(panelArea);
		add(panelInput, BorderLayout.SOUTH);
		
		setTitle("다중채팅프로그램");
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		try {
			socket = new Socket("70.12.109.120", 4321);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String nickName = JOptionPane.showInputDialog(this, "대화명을 입력하세요.", JOptionPane.INFORMATION_MESSAGE);
			bw.write(nickName + '\n');
			bw.flush();
			
			new ListenThread().start();
			
		} catch (IOException e) {
			System.out.println("소켓정보 불일치");
			e.printStackTrace();
		}
		
	}
	
	class ChattingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String msg = chatField.getText();
			chatArea.append(msg);
			chatField.setText(" ");
			try {
				bw.write(msg + '\n');
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	
	class ListenThread extends Thread {
		@Override
		public void run() {
			try {
				String receiveMsg = br.readLine();
				chatArea.append(receiveMsg + '\n');
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Client c = new Client();
	}
}
