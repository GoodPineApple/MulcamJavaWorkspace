package practice02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	Color color= new Color(0, 0, 0);
	
	public MyPanel() {
		setLayout(new BorderLayout());
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(0,0,500,500);
	}
	
	

}
