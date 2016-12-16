package movingBox;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btnLeft = new JButton("왼쪽으로 이동");
	private JButton btnRight = new JButton("오른쪽으로 이동");
	private JPanel panelBtn = new JPanel();

	MyPanel panelMoveZone = new MyPanel();

	public MyFrame() {
		panelMoveZone.addKeyListener(new keyListener());
		add(panelMoveZone, BorderLayout.CENTER);

		panelBtn.setLayout(new FlowLayout());
		panelBtn.add(btnLeft);
		panelBtn.add(btnRight);
		btnLeft.addActionListener(new actionListener());
		btnRight.addActionListener(new actionListener());
		add(panelBtn, BorderLayout.PAGE_END);

		setTitle("박스 움직이기");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	class keyListener implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:
				panelMoveZone.x += 10;
				break;
			case KeyEvent.VK_LEFT:
				panelMoveZone.x -= 10;
				break;
			}
			repaint();
			invalidate();
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}

	class actionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnRight) {
				panelMoveZone.x += 10;
			} else if (e.getSource() == btnLeft) {
				panelMoveZone.x -= 10;
			}
			repaint();
			invalidate();

		}

	}
}
