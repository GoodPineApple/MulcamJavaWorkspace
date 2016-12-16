package practice02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("색상변경");
	MyPanel panel = new MyPanel();

	public MyFrame() {
		add(panel);
		panel.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new Listener());


		setTitle("Color Test");
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.color = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
					(int) (Math.random() * 255.0));
			repaint();
		}

	}

}
