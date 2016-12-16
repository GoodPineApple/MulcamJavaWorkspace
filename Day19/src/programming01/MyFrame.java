package programming01;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	private JLabel[] label = new JLabel[12];
	
	public MyFrame() {
//		String s = "Hello World!";
//		for(int i = 0; i<12; i++){
//		label[i] = s.substring(i);
//		}
//		add(label);
//		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
//		
//		label.setBackground(new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
//				(int) (Math.random() * 255.0)));
//		
//		setSize(800, 200);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
