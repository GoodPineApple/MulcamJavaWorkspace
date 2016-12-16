package test02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class MyFrame2 extends JFrame {
	
	private JLabel labelOut = new JLabel("밖");
	private JLabel labelIn = new JLabel("안");
	private JPanel panelOut = new JPanel();
	private JPanel panelIn = new JPanel();
	
	public MyFrame2() {
		TitledBorder border = BorderFactory.createTitledBorder("경계");
				
		panelOut.add(labelOut);
		panelIn.setBorder(border);
		panelIn.add(labelIn);
		
		add(panelOut, BorderLayout.PAGE_START);
		add(panelIn, BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}

}