package movingBox;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	protected int x = 270, y = 20;

	public MyPanel() {
		setBackground(Color.yellow);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.orange);
		g.fillRect(x, y, 60, 250);
		
		requestFocus();   
		setFocusable(true);

	}
	
	

	
}
