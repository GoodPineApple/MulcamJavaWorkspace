package practice02;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel label1 = new JLabel("원금을 입력하시오");
	JLabel label2 = new JLabel("이율을 입력하시오");
	JButton btn1 = new JButton("변환");
	
	JTextArea text1 = new JTextArea(1,5);
	JTextArea text2 = new JTextArea(1,5);
	JTextArea text3 = new JTextArea(1,10);
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		panel1.add(label1);
		panel1.add(text1);
		panel1.setLayout(new FlowLayout());
		
		panel2.add(label2);
		panel2.add(text2);
		panel2.setLayout(new FlowLayout());
		
		panel3.add(btn1);
		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel3.add(text3);
		text3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		
		MyMouseListener listener = new MyMouseListener();
		btn1.addMouseListener(listener);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		add(panel);
		
//		setResizable(false);
		setSize(200, 200);
		setTitle("이자 계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			text3.append(" " + (Double.parseDouble(text1.getText()) + ((Double.parseDouble(text1.getText()) * (Double.parseDouble(text2.getText()))) / 100)));
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
			
		};
	}

}
