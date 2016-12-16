package test06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btnRed = new JButton("RED");
	private JButton btnBlue = new JButton("BLUE");
	private JPanel panelBackground = new JPanel();

	public MyFrame() {
		panelBackground.add(btnBlue);
		panelBackground.add(btnRed);

		//무명클래스를 활용
		btnRed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelBackground.setBackground(Color.RED);
			}
		});

		btnBlue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelBackground.setBackground(Color.BLUE);
			}
		});

		add(panelBackground);

		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
