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
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test06.ServerFrame.MyListener;

public class ClientFrame extends JFrame {
	//그래픽 관련 맴버
		private JTextArea textArea = new JTextArea();
		private JTextField textField = new JTextField();
		//서버 관련 맴버
		private BufferedReader br;
		private BufferedWriter bw;
		
		//////////////////////////////////////////////////////////////////
		
		public ClientFrame(){
			//그래픽 관련 초기작업
			textArea.setEditable(false);
			textField.setBackground(Color.PINK);
			
		
			
			textField.addActionListener(new MyListener());
			
			add(new JScrollPane(textArea), BorderLayout.CENTER);
//			add(textArea, BorderLayout.CENTER);
			add(textField, BorderLayout.SOUTH);
			
			setSize(300,400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		
	/////////////////////////////////////////////////////////////////////////////////////
			//네트워크 관련 클라이언트 초기작업
			try {
				Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 7777);
				
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//채팅 준비완료
				while(true) {
					String receiveMsg = br.readLine();
					textArea.append("서버:" + receiveMsg + '\n');
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
				
				// 서버에 접속되었는지 검사한 후
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
			ClientFrame s = new ClientFrame();
		}
}
