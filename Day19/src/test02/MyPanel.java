package test02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private int x = 10, y = 10, size = 50; 
	private boolean isSelected = false;

	public MyPanel() {
		addKeyListener(new MyPanelKeyListener());
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseListener());

		requestFocus();    //패널을 고정???
		setFocusable(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(50, 100, 50));
		g.fillRect(x, y, size, size);
		
		requestFocus();    
		setFocusable(true);
	}
	
	class MyPanelKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				y -= 2;
				break;
			case KeyEvent.VK_DOWN:
				y += 2;
				break;
			case KeyEvent.VK_LEFT:
				x -= 2;
				break;
			case KeyEvent.VK_RIGHT:
				x += 2;
				break;
			}
			
			switch(e.getKeyChar()){
			case 'b' :
				size += 10;
				break;
			case 's' :
				size -= 10;
				break;
			}
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

	}
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int mouseX = e.getX();
			int mouseY = e.getY();
			
			if((x<=mouseX&& mouseX<=(x+size)) && (y<=mouseY&& mouseY<=(y+size)) ) {
				isSelected = true;
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if(isSelected == true) {
				isSelected = false;
				int mouseX = e.getX();
				int mouseY = e.getY();
				x = e.getX();
				y = e.getY();
				repaint();
			}
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			if(isSelected == true) {
				int mouseX = e.getX();
				int mouseY = e.getY();
				x = e.getX();
				y = e.getY();
				repaint();
			}
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
//			x = e.getX();
//			y = e.getY();
//			repaint();
		}
		
	}

}
