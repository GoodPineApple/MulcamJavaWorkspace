package test03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	private JButton btn = new JButton("버튼입니다.");
	
	public MyFrame(){
		setLayout(new FlowLayout());
		add(btn);
		
		setSize(1000, 200);
		setTitle("세번째제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
