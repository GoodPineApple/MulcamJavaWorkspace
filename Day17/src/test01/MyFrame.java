package test01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("��ư�Դϴ�.");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		//1�����
		MyListener Listener = new MyListener(); // �̺�Ʈ ó���� ��ü ����
		btn.addActionListener(Listener); // �̺�Ʈ ó���� ��ü ���
		
		add(btn);
		
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	

}
