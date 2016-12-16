package programming03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame{
	private JTextArea text = new JTextArea(23 + "                                                        ");
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panelno = new JPanel();
	private JButton btn1 = new JButton("0");
	private JButton btn2 = new JButton("1");
	private JButton btn3 = new JButton("2");
	private JButton btn4 = new JButton("3");
	private JButton btn5 = new JButton("4");
	private JButton btn6 = new JButton("5");
	private JButton btn7 = new JButton("6");
	private JButton btn8 = new JButton("7");
	private JButton btn9 = new JButton("8");
	private JButton btn10 = new JButton("9");
	private JButton btn11 = new JButton("/");
	private JButton btn12 = new JButton("*");
	private JButton btn13 = new JButton("-");
	private JButton btn14 = new JButton("+/-");
	private JButton btn15 = new JButton("=");
	private JButton btn16 = new JButton("+");
	private JButton btn17 = new JButton("C");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		panel1.add(text);
		
		panel2.add(btn17);
		
		panel3.add(btn8);
		panel3.add(btn9);
		panel3.add(btn10);
		panel3.add(btn11);
		panel3.add(btn5);
		panel3.add(btn6);
		panel3.add(btn7);
		panel3.add(btn12);
		panel3.add(btn2);
		panel3.add(btn3);
		panel3.add(btn4);
		panel3.add(btn13);
		panel3.add(btn1);
		panel3.add(btn14);
		panel3.add(btn15);
		panel3.add(btn16);
		panel3.setLayout(new GridLayout(4, 4));
		
		panel.setLayout(new BorderLayout());
		panel.add(panel1, BorderLayout.NORTH);
		panel.add(panel2, BorderLayout.WEST);
		panel.add(panelno, BorderLayout.EAST);
		panel.add(panel3, BorderLayout.SOUTH);
		add(panel);
		
		
		setTitle("°è»ê±â");
		setSize(200, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
