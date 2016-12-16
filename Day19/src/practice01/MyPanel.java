package practice01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 20, 100, 100);
		
		g.setColor(Color.BLACK);
		g.drawArc(30, 45, 30, 30, 0, 180);
		g.drawArc(65, 45, 30, 30, 0, 180);
		
		g.drawArc(20, 50, 80, 50, 0, -180);
		
		
	}

}
