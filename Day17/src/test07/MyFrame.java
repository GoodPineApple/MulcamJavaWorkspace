package test07;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btnCount = new JButton("Count");
	private JButton btnReset = new JButton("Reset");
	private JPanel panelCount = new JPanel();
	private JPanel panelbtn = new JPanel();
	private JLabel lbCount = new JLabel("0");
	private int count = 0;
	
	public MyFrame() {
		panelCount.add(lbCount);
		lbCount.setFont(new Font("±¼¸²", Font.BOLD, 100));
		
		CountListener listener = new CountListener();
		btnCount.addActionListener(listener);
		btnReset.addActionListener(listener);
		
		panelbtn.setLayout(new GridLayout(0, 2));
		panelbtn.add(btnCount);
		panelbtn.add(btnReset);
		
		add(panelCount, BorderLayout.CENTER);
		add(panelbtn, BorderLayout.PAGE_END);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class CountListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnCount) {
				count++;
			} else if(e.getSource() == btnReset){
				count = 0;
			}
			lbCount.setText(count + "");
		}
		
	}
	
	
}
