package test04;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JPanel panel = new JPanel();
	private JButton btn1 = new JButton("버튼1");
	private JButton btn2 = new JButton("버튼2");
	private JButton btn3 = new JButton("버튼3");
	private JLabel lb = new JLabel("레이블입니다.");
	
	public MyFrame( ) {
		setLayout(new FlowLayout());
		
		panel.setSize(100, 100);
		panel.setBackground(Color.yellow);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(lb);
		
		add(panel);
		
		setResizable(false);
		setSize(1000, 200);
		setTitle("네번째제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
}
