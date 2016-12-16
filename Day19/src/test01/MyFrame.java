package test01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private MyPanel p = new MyPanel();
	
	public MyFrame(){
		add(p);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	

}
