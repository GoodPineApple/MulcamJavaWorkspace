package test06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerFrame extends JFrame {
	//그래픽 관련 맴버
	private JTextArea textArea = new JTextArea();
	private JTextField textField = new JTextField();
	//서버 관련 맴버
	private BufferedReader br;
	private BufferedWriter bw;
	
	//////////////////////////////////////////////////////////////////
	
	public ServerFrame(){
		//그래픽 관련 초기작업
		textArea.setEditable(false);
		textField.setBackground(Color.PINK);
		
	
		
		textField.addActionListener(new MyListener());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
//		add(textArea, BorderLayout.CENTER);
		add(textField, BorderLayout.SOUTH);
		
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
/////////////////////////////////////////////////////////////////////////////////////
		//네트워크 관련 서버 초기작업
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			textArea.setText("서버 기다리는중... \n");
			Socket socket = serverSocket.accept();
			textArea.setText("클라이언트 접속함!" + socket.getInetAddress() + '\n');
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//채팅 준비완료
			while(true) {
				String receiveMsg = br.readLine();
				textArea.append("클라이언트:" + receiveMsg + '\n');
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String writeMsg = textField.getText();
			
			textArea.append("나:"+writeMsg +'\n');
			textField.setText("");
			
			if(bw != null) {
				try {
					bw.write(writeMsg + '\n');
					bw.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			textArea.setCaretPosition(textArea.getText().length());
		}
	}

	public static void main(String[] args) {
		ServerFrame s = new ServerFrame();
	}
}
