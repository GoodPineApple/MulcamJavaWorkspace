package test01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g); // 비어있는 패널 판 그리기는 지우지 않는다.
		g.drawLine(10, 10, 50, 50);
		
		g.drawRect(10, 70, 40, 30);
		
		g.drawOval(10, 120, 40, 30);
		
		g.setColor(Color.yellow);
		g.fill3DRect(10, 170, 40, 30, true);
		
		g.setColor(Color.BLUE);
		g.drawArc(100, 50, 80, 50, 0, 90);
		
		g.setColor(new  Color(255, 50, 0));
		g.fillRect(110, 50, 40, 50);
	}

}
