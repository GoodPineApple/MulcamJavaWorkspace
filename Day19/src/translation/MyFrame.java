package translation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	private JLabel label = new JLabel("Don't hurt before you are hurt");
	
	public MyFrame() {
		add(label);
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
		
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {
				label.setText("Don't hurt before you are hurt");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("다치기도 전에 울지마라");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		setVisible(true);
		setSize(700, 200);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
