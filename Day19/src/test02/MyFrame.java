package test02;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyPanel p = new MyPanel();
	
	public MyFrame() {
		add(p);
		
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
