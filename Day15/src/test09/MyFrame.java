package test09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public JButton btn01 = new JButton("button01");
	public JButton btn02 = new JButton("btn2");
	public JButton btn03 = new JButton("button000000000005");

	public MyFrame() {
		//���� �����ӿ� �߰��Ǵ� ������Ʈ ��ġ���� ������ǥ

		setLayout(null);
		
		add(btn01);
		add(btn02);
		add(btn03);
		
		btn01.setBounds(0, 0, 100, 150);
		btn02.setBounds(0, 200, 100, 100);
		btn03.setBounds(200, 200, 100, 600);
		
		setResizable(true);
		setSize(500, 300);
		setTitle("�ϰ���°����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}

}
