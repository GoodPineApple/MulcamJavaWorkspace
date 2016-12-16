package test03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

public class PopupMenuTest extends JFrame implements ActionListener {
	private JPopupMenu popup;
	private JMenuItem menuItem1, menuItem2;
	private JTextArea ta;
	
	public PopupMenuTest() {
		ta = new JTextArea(10, 20);
		add(ta);
		
		popup = new JPopupMenu();
		menuItem1 = new JMenuItem("Ž�� �޴�");
		menuItem1.addActionListener(this);
		popup.add(menuItem1);
		menuItem2 = new JMenuItem("���� �޴�");
		menuItem2.addActionListener(this);
		popup.add(menuItem2);
		
		ta.addMouseListener(new PopupListener());
		
		setTitle("�˾� �޴� �׽�Ʈ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);	
	}
	
	class PopupListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			showPopup(e);
		}
		public void mouseReleased(MouseEvent e) {
			showPopup(e);
		}
		private void showPopup(MouseEvent e) {
			if(e.isPopupTrigger()) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "Ž���� ���õǾ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		new PopupMenuTest();
	}
	
	

}