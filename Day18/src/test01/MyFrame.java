package test01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JTextArea textArea = new JTextArea();
	private JTextField textField = new JTextField();
	
	public MyFrame() {
		textArea.setEditable(false);
		textField.setBackground(Color.pink);
		
		textField.addActionListener(new MyListener());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		add(textField, BorderLayout.SOUTH);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.append(textField.getText()+"\n");
			textField.setText("");
		}
		
	}
}