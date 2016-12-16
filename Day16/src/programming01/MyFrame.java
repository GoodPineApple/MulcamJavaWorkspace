package programming01;

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
	JLabel label = new JLabel("거리를 마일 단위로 입력하시오");
	JButton btn1 = new JButton("변환");
	
	JTextArea text1 = new JTextArea(" " + 1);
	JTextArea text2 = new JTextArea("1마일은 1.6킬로미터입니다.");
	
	public MyFrame() {
		
		panel1.add(label);
		panel1.add(text1);
		panel1.setLayout(new FlowLayout());
		
		panel2.add(btn1);
		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel2.add(text2);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

		
		panel.add(panel1);
		panel.add(panel2);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		setLayout(new FlowLayout());
		add(panel);
		
		setResizable(false);
		setSize(300, 200);
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
