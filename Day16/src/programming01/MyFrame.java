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
	JLabel label = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
	JButton btn1 = new JButton("��ȯ");
	
	JTextArea text1 = new JTextArea(" " + 1);
	JTextArea text2 = new JTextArea("1������ 1.6ų�ι����Դϴ�.");
	
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
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
