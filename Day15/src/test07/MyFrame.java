package test07;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public JButton btn01 = new JButton("button01");
	public JButton btn02 = new JButton("btn2");
	public JButton btn03 = new JButton("button000000000005");
	public JButton btn04 = new JButton("button3");
	public JButton btn05 = new JButton("btn04");
	
	private JPanel panel = new JPanel();
	private JPanel pane2 = new JPanel();
	
	public MyFrame() {
		//배치관리자를 사용하지 않았을 때 JFrame은 BorderLayout 기본
		//JPanel은 FlowLayout이 기본임
		
		panel.add(btn01);
		panel.add(btn02);
		panel.add(btn03);
		panel.add(btn04);
		panel.add(btn05);
		
		panel.setBackground(Color.CYAN);
		pane2.setBackground(Color.RED);
		add(panel, BorderLayout.CENTER);
		add(pane2, BorderLayout.PAGE_END);
		
		setSize(500, 300);
		setTitle("일곱번째제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}

}
