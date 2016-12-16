package test03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.MarshalledObject;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.activation.ActivationDesc;
import java.rmi.activation.ActivationException;
import java.rmi.activation.ActivationID;
import java.rmi.activation.ActivationInstantiator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("버튼입니다.");

	public MyFrame() {
		setLayout(new FlowLayout());
		
		//3번방법(무명클래스)
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setText("눌렸습니다!!");

			}
		});
		add(btn);

		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
}
