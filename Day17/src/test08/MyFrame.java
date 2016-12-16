package test08;

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
	
	public MyFrame() {
		panelCount.add(lbCount);
		lbCount.setFont(new Font("굴림", Font.BOLD, 100));
		
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
// String을 통해 바로 바로 변화하는 방법
		@Override
		public void actionPerformed(ActionEvent e) {
			int n = 0;
			if(e.getSource() == btnCount) {
				String lbStr = lbCount.getText();
				n=Integer.parseInt(lbStr);
				n++;
			} else if(e.getSource() == btnReset){
				n = 0;
			}
			lbCount.setText(n + "");
		}
		
	}
	
	
}
