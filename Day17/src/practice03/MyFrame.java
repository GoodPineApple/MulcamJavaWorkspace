package practice03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	static int count;
	private JButton btn1 = new JButton("count");
	private JButton btn2 = new JButton("reset");
	private JLabel label = new JLabel(count + " ");
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();

	MyFrame() {
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.setLayout(new GridLayout(0, 2));
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(++count + " ");
			}
		});
		
		panel1.add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText((count = 0)+ " " );
			}
		});
		
		panel2.add(label);
		label.setSize(20, 30);
		
		panel.setLayout(new BorderLayout());
		panel.add(panel2, BorderLayout.CENTER);
		panel.add(panel1, BorderLayout.SOUTH);
		
		
		add(panel);
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}


}
