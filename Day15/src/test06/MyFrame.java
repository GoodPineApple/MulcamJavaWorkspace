package test06;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public JButton btn01 = new JButton("button01");
	public JButton btn02 = new JButton("btn2");
	public JButton btn03 = new JButton("button000000000005");
	public JButton btn04 = new JButton("button3");
	public JButton btn05 = new JButton("btn04");
	
	public MyFrame() {
		//��ġ�����ڸ� ������� �ʾ��� �� JFrame�� BorderLayout �⺻
		//JPanel�� FlowLayout�� �⺻��
		
//		setLayout(new FlowLayout());    - FlowLayout���� �ٲ�
		
		add(btn01, BorderLayout.NORTH);
		add(btn02, BorderLayout.EAST);
		add(btn03, BorderLayout.WEST);
		add(btn04, BorderLayout.CENTER);
		add(btn05, BorderLayout.SOUTH);
		
		setResizable(false);
		setSize(500, 300);
		setTitle("������°����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}

}
