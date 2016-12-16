package test05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton btnRed = new JButton("RED");
	private JButton btnBlue = new JButton("BLUE");
	private JPanel panelBackground = new JPanel();
	
	public MyFrame() {
		panelBackground.add(btnBlue);
		panelBackground.add(btnRed);
		
		ColorListener listener = new ColorListener();
		btnBlue.addActionListener(listener);
		btnRed.addActionListener(listener);
		
		add(panelBackground);
		
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	// getSource를 활용하여 1개의 내부클래스
	class ColorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnRed){
				panelBackground.setBackground(Color.RED);
			} else if(e.getSource() == btnBlue) {
				panelBackground.setBackground(Color.BLUE);
			}
			
		}
		
	}

}
