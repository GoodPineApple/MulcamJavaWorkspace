package test04;

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
		
		BlueListener blueListener = new BlueListener();
		RedListener redListener = new RedListener();
		btnBlue.addActionListener(blueListener);
		btnRed.addActionListener(redListener);
		
		add(panelBackground);
		
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	//2개의 내부 클래스
	class RedListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			panelBackground.setBackground(Color.RED);
			
		}
		
	}
	
	class BlueListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			panelBackground.setBackground(Color.RED);
			
		}
		
	}

}
