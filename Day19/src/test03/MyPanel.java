package test03;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
	private BufferedImage img = null; // 이미지 불러오기
	private int x=10, y=10, size;
	private boolean isSelected = false;
	private JButton btn = new JButton("btn");
	
	
	public MyPanel() {
		addKeyListener(new MyPanelKeyListener());
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseListener());

		requestFocus();    //패널을 고정???
		setFocusable(true);
		
		add(btn, BorderLayout.WEST);
		
		
		try {
		img = ImageIO.read(new File("SfrwQ1X6.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, x, y, null);
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
