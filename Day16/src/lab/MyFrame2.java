package lab;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {
	JPanel p1;
	public MyFrame2() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 4));
		for (int i = 0; i < 10; i++) {
			p1.add(new JButton("Button" + i));
		}
		add(p1);
		setVisible(true);
	}
}
