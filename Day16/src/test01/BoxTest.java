package test01;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel, "Button1");
		makeButton(panel, "Button2");
		makeButton(panel, "Button3");
		makeButton(panel, "B4");
		makeButton(panel, "Long Button5");
		add(panel);
		pack();
		setVisible(true);
		
	}

	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button);
	}


}

public class BoxTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
}
