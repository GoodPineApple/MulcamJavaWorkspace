package test03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	
	public MyFrame() {
		
		panel.setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		panel.addMouseListener(listener);
		panel.addMouseMotionListener(listener);
		add(panel);
		
		
		
		
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("드래그");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
//			System.out.println("움직임" + e.getX() + "," + e.getY());
		}

		@Override
		public void mouseClicked(MouseEvent e) {
//			System.out.println("클릭됨" + e.getClickCount());
		}

		@Override
		public void mouseEntered(MouseEvent e) {
//			System.out.println("들어옴");
		}

		@Override
		public void mouseExited(MouseEvent e) {
//			System.out.println("나감");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("눌림" + e.getX() + "," + e.getY());
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("해제됨" + e.getX() + "," + e.getY());
		}
		
	}

}
