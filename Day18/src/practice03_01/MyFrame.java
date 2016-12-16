package practice03_01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	private JTextArea text = new JTextArea(1, 10);
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panelno = new JPanel();
	private JButton btn17 = new JButton("C");
	private JButton[] buttons = new JButton[16];

	public MyFrame() {
		int btnCount = 0;
		for (int j = 0; j <= 12; j += 4) {
			for (int i = 0; i < 4; i++) {
				if (btnCount == 3) {
					buttons[btnCount] = new JButton("/");
				} else if (btnCount == 7) {
					buttons[btnCount] = new JButton("*");
				} else if (btnCount == 11) {
					buttons[btnCount] = new JButton("-");
				} else if (btnCount == 12) {
					buttons[btnCount] = new JButton("0");
				} else if (btnCount == 13) {
					buttons[btnCount] = new JButton(" ");
				} else if (btnCount == 14) {
					buttons[btnCount] = new JButton("=");
				} else if (btnCount == 15) {
					buttons[btnCount] = new JButton("+");
				} else {
					while (btnCount <= 3) {
						buttons[btnCount] = new JButton((i + j + 1) + "");
						break;
					}
					while (btnCount > 3 && btnCount <= 7) {
						buttons[btnCount] = new JButton((i + j) + "");
						break;
					}
					while (btnCount > 7 && btnCount <= 11) {
						buttons[btnCount] = new JButton((i + j - 1) + "");
						break;
					}
				}
				btnCount++;
			}
		}
		buttons[12] = new JButton("0");
		buttons[13] = new JButton("+/-");
		buttons[14] = new JButton("=");
		buttons[15] = new JButton("+");
		//////////////////////////////////////////////////////////////// 배치
		setLayout(new FlowLayout());
		panel1.add(text);

		panel2.add(btn17);

		panel3.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < 16; i++) {
			panel3.add(buttons[i]);
		}

		panel.setLayout(new BorderLayout());
		panel.add(panel1, BorderLayout.NORTH);
		panel.add(panel2, BorderLayout.WEST);
		panel.add(panelno, BorderLayout.EAST);
		panel.add(panel3, BorderLayout.SOUTH);
		add(panel);

		//////////////////////////////////////////////////////////////// 설정
		setTitle("계산기");
		setSize(200, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		///////////////////////////////////////////////////////////////// 이벤트
		Mylistener mylistener = new Mylistener();
		for (int i = 0; i < 16; i++) {
			buttons[i].addActionListener(mylistener);
		}

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	} 

	class Mylistener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			int[] intarray = new int[10];
			String[] Stringarray = new String[9];
			int i = 0;
				if (b == buttons[3]) {
					intarray[i] = Integer.parseInt(text.getText());
					text.setText("");
					Stringarray[i] = "/";
					i++;
				} else if (b == buttons[7]) {
					intarray[i] = Integer.parseInt(text.getText());
					Stringarray[i] = "*";
					text.setText("");
					i++;
				} else if (b == buttons[11]) {
					intarray[i] = Integer.parseInt(text.getText());
					Stringarray[i] = "-";
					text.setText(intarray[0] + "");
					i++;
				} else if (b == buttons[15]) {
					intarray[i] = Integer.parseInt(text.getText());
					Stringarray[i] = "+";
					text.setText("");
					i++;
				} else if (b == buttons[14]) {
					if(Stringarray[0] == "*") {
						intarray[0] = intarray[0] * intarray[1];
					}else if(Stringarray[0] == "/") {
						intarray[0] = intarray[0] / intarray[1];
					}
					
					text.append(intarray[0] + "");
				} else {
					text.append(b.getText());
				}
//				 + Integer.parseInt(Stringarray[1]) + intarray[2] + Integer.parseInt(Stringarray[2]) + intarray[3] + Integer.parseInt(Stringarray[3]) + intarray[4] + Integer.parseInt(Stringarray[4]) + intarray[5] + Integer.parseInt(Stringarray[5]) + intarray[6] + Integer.parseInt(Stringarray[6]) + intarray[7] + Integer.parseInt(Stringarray[7]) + intarray[8] + Integer.parseInt(Stringarray[8]) + intarray[9]
		}
	}
}
