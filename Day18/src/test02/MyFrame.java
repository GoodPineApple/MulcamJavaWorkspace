package test02;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JTextField tf = new JTextField(10);
	
	public MyFrame() {
		tf.addKeyListener(new MyKeyListener());
		setLayout(new FlowLayout());
		add(tf);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent ev) {
			System.out.println("´­·¶À½:" + ev.getKeyCode()+
									 "/"+ev.getKeyChar()+"/"+ev.isControlDown());
		}

		@Override
		public void keyReleased(KeyEvent ev) {
			System.out.println("ÇØÁ¦µÊ:" + ev.getKeyCode()+
									 "/"+ev.getKeyChar()+"/"+ev.isControlDown());
		}

		@Override
		public void keyTyped(KeyEvent ev) {
			System.out.println("ÀÔ·Â¶õ:" + ev.getKeyCode()+
								  	 "/"+ev.getKeyChar()+"/"+ev.isControlDown());
		}
		
	}

}
