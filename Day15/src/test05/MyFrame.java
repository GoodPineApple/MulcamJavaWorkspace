package test05;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn1 = new JButton("���� ��ư");
	private JButton btn2 = new JButton("�߾� ��ư");
	private JButton btn3 = new JButton("������ ��ư");

	
	public MyFrame( ) {
		setLayout(new FlowLayout());
			
		btn3.setEnabled(false);
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setResizable(false);
		setSize(500, 200);
		setTitle("�ټ���°����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	

}
