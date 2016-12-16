package test05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private JTextArea textArea = new JTextArea();
	private JTextField textField = new JTextField();
	
	public MyFrame(){
		textArea.setEditable(false);
		textField.setBackground(Color.PINK);
		
		TCPChattingServer server = new TCPChattingServer();
		
		server.toString();
		
		textField.addActionListener(new MyListener());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
//		add(textArea, BorderLayout.CENTER);
		add(textField, BorderLayout.SOUTH);
		
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
/////////////////////////////////////////////////////////////////////////////////////
		
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("Server Wait...");
			Socket socket = serverSocket.accept();
			System.out.println("Connet!");
			
			new Speak(socket).start();
			new Listen(socket).start();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.append(textField.getText()+"\n");
			textField.setText("");
		}
	}
}
