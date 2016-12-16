package test02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import test01.MyListener;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("��ư�Դϴ�.");

	public MyFrame() {
		setLayout(new FlowLayout());

		add(btn);
		MyListener Listener = new MyListener(); // �̺�Ʈ ó���� ��ü ����
		btn.addActionListener(Listener); // �̺�Ʈ ó���� ��ü ���

		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// 2�����
		class MyListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setText("���Ƚ��ϴ�.");
			}

		}
	}

}
