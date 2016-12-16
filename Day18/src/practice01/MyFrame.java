package practice01;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label = new JLabel("거리를 마일 단위로 입력하시오");
	JButton btn1 = new JButton("변환");

	JTextArea textResult = new JTextArea(1, 10);
	JTextArea textEnter = new JTextArea(1, 5);

	public MyFrame() {

		panel1.add(label);
		panel1.add(textEnter);
		panel1.setLayout(new FlowLayout());

		panel2.add(btn1);
		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel2.add(textResult);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

		textResult.setEditable(false);
		Listener myListener = new Listener();
		btn1.addMouseListener(myListener);
		
		
		
		panel.add(panel1);
		panel.add(panel2);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		setLayout(new FlowLayout());
		add(panel);

		setResizable(false);
		setSize(300, 200);
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}


	class Listener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			textResult.setText(" ");
			textResult.append(" " + (Double.parseDouble(textEnter.getText()) * 1.609));
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
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
