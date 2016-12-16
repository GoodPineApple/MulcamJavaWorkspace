package practice01;

import java.awt.Color;
import java.awt.FlowLayout;
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
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.red);
			}
		});
		
		panel.add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}
		});
		
		add(panel);
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
