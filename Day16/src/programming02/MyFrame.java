package programming02;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel label1 = new JLabel("원금을 입력하시오");
	JLabel label2 = new JLabel("이율을 입력하시오");
	JButton btn1 = new JButton("변환");
	
	JTextArea text1 = new JTextArea(" " + 1000);
	JTextArea text2 = new JTextArea("     " + 7.5);
	JTextArea text3 = new JTextArea("1마일은 1.6킬로미터입니다.");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		panel1.add(label1);
		panel1.add(text1);
		panel1.setLayout(new FlowLayout());
		
		panel2.add(label2);
		panel2.add(text2);
		panel2.setLayout(new FlowLayout());
		
		panel3.add(btn1);
		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel3.add(text3);
		text3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		add(panel);
		
//		setResizable(false);
		setSize(200, 200);
		setTitle("이자 계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
