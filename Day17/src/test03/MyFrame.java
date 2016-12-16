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
	private JButton btn = new JButton("��ư�Դϴ�.");

	public MyFrame() {
		setLayout(new FlowLayout());
		
		//3�����(����Ŭ����)
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setText("���Ƚ��ϴ�!!");

			}
		});
		add(btn);

		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
}
