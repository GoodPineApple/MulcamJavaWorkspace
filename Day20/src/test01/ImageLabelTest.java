package test01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JLabel label;
	private JButton button;
	private JPanel panel2;
	public ImageLabelTest() {
		setTitle("�̹��� ���̺�");
		setSize(500,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("�̹����� ������ �Ʒ� ��ư�� ��������.");
		
		add(panel2);
		
		button = new JButton("�̹��� ���̺�");
		ImageIcon icon = new ImageIcon("star.png");
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ImageLabelTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon hJW = new ImageIcon("Hungry.jpg");
		label.setIcon(hJW);
		label.setText(null);
	}

}
