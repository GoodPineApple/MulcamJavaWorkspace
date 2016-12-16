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
	// GUI �ɹ�
	private JPanel panelArea;
	private JPanel panelInput;
	private JTextArea chatArea;
	private JTextField chatField;
	private JButton btnSend;

	// TCP ��� �ɹ�
	private BufferedReader br;
	private BufferedWriter bw;

	// �����ڿ��� �ʱ��۾�
	public ClientFrame() {
		// GUI �ʱ�ȭ �ι�
		panelArea = new JPanel();
		panelInput = new JPanel();
		chatArea = new JTextArea();
		chatArea.setEditable(false);
		chatField = new JTextField();
		btnSend = new JButton("����");

		ChattingListener listener = new ChattingListener();// �̺�Ʈ ó����(�������� �޼��� ������ �۾�) ���
		chatField.addActionListener(listener);
		btnSend.addActionListener(listener);

		panelArea.setLayout(new BorderLayout());
		panelArea.add(new JScrollPane(chatArea));

		panelInput.setLayout(new BorderLayout());
		panelInput.add(chatField);
		panelInput.add(btnSend, BorderLayout.EAST);
		
		add(panelArea, BorderLayout.CENTER);
		add(panelInput, BorderLayout.SOUTH);

		setTitle("����ä�� Ŭ���̾�Ʈ ������");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // �׷��� ����
		setVisible(true);
		////////////////////////////////////////////////////////////////////////////////////////////
		// �������� ����� ���� ��Ʈ��ũ ���� �κ�
		try {
			Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// ������ ������ �Ŀ� �г����� �Է��ؼ� �����ϱ�
			String nickName = JOptionPane.showInputDialog(this, "��ȭ�� �Է��ϼ���.", JOptionPane.INFORMATION_MESSAGE);
			bw.write(nickName + '\n');
			bw.flush();

			// �г��� ���� �Ŀ��� ������ ������ �޼��� �޴� ������
			new ListenThread().start();
		} catch (IOException e) {
			System.out.println("������ �� ����");
			e.printStackTrace();
		}
	}

	// �̺�Ʈ ó�� Ŭ����(ä�ó��� �������� ������)
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

	// �����κ��� �޼����� �޴� ���� ������ Ŭ����
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
