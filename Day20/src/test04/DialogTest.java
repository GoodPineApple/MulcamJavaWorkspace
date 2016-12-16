package test04;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogTest extends JFrame implements ActionListener{
	JPanel p;
	JButton b1, b2;
	SimpleDialog aDialog;
	
	DialogTest() {
		p = new JPanel();
		add(p,"Center");
		b1 = new JButton("대화상자 생성");
		b2 = new JButton("종료");
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		
		setTitle("DialogTest");
		setSize(300,100);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			if (aDialog == null) {
				aDialog = new SimpleDialog(this, "Simple Dialog");
			}
			aDialog.setVisible(true);
			b1.requestFocus();
		}
		if(e.getSource() == b2) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		DialogTest f = new DialogTest();
	}

}

class SimpleDialog extends JDialog implements ActionListener {
	JPanel p1, p2;
	JLabel l;
	JButton okButton;
	JButton cancelButton;
	
	SimpleDialog(Frame parent, String str) {
		super(parent, str, true);
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		add(p1);
		setSize(200, 300);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
