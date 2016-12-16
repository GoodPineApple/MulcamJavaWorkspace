package test02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import test01.MyListener;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("버튼입니다.");

	public MyFrame() {
		setLayout(new FlowLayout());

		add(btn);
		MyListener Listener = new MyListener(); // 이벤트 처리기 객체 생성
		btn.addActionListener(Listener); // 이벤트 처리기 객체 등록

		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// 2번방법
		class MyListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setText("눌렸습니다.");
			}

		}
	}

}
