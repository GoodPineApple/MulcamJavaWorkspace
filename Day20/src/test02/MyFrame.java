package test02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
	
	private JLabel labelOut = new JLabel("¹Û");
	private JLabel labelIn = new JLabel("¾È");
	private JPanel panelOut = new JPanel();
	private JPanel panelIn = new JPanel();
	
	public MyFrame() {
		Border border = BorderFactory.createTitledBorder("");
		
		panelOut.add(labelOut);
		panelIn.setBorder(border);
		panelIn.add(labelIn);
		
		add(panelOut, BorderLayout.PAGE_START);
		add(panelIn, BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
