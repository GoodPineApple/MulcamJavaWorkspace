package practice02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btn1 = new JButton("»¡°­");
	private JButton btn2 = new JButton("ÆÄ¶û");
	private JPanel panel = new JPanel();

	MyFrame() {
		panel.add(btn1);
		panel.add(btn2);
		
		MyListener1 Listener1 = new MyListener1();
		btn1.addActionListener(Listener1);
		MyListener2 Listener2 = new MyListener2();
		btn2.addActionListener(Listener2);
		
		add(panel);
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class MyListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			panel.setBackground(Color.RED);
		}
		
	}
	
	class MyListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			panel.setBackground(Color.BLUE);
		}
		
	}

}
