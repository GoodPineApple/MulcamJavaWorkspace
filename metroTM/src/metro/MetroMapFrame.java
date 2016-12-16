package metro;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MetroMapFrame extends JFrame {
	private Dialog3Choice aDialog; // ��߿�, ������, ������ ���� ���̾�α�
	private MapPanel metroMapPanel; // �뼱�� �̹��� �׸��� �г�
	final MetroVO metroVOnull = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); //�ʱ�ȭ
	MetroVO metroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0);
	MetroVO departmetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // ��߿�
	MetroVO arrivemetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // ������

	MetroDao metroDao = new MetroDao();
	
   	private int departStn;
	private int arriveStn;
	private int currentHour;
	private int currentMinute;
	private int ArrivalHour;
	private int ArrivalMinute;
	private String Arrival;
	

	public MetroMapFrame() {
		// �̹��� �׸���
		metroMapPanel = new MapPanel();
		metroMapPanel.addMouseListener(new MyMouseListener());
		add(metroMapPanel);

		// ������ �⺻����
		setSize(1275, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	class MyMouseListener implements MouseListener {
		// ���� ������ ����ȣ�� ����
		@Override
		public void mouseClicked(MouseEvent e) {
			///////////////////////////////////////////////////////////////////////////////////// 1ȣ��
			if (((e.getX() > 945) && (e.getX() < 955)) && ((e.getY() > 63) && (e.getY() < 73))) {
				metroVO.setStnnum(101);
				aDialog = new Dialog3Choice(this); // ������101 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 927) && (e.getX() < 937)) && ((e.getY() > 90) && (e.getY() < 100))) {
				metroVO.setStnnum(102);
				aDialog = new Dialog3Choice(this); // ����翪102 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 909) && (e.getX() < 919)) && ((e.getY() > 118) && (e.getY() < 128))) {
				metroVO.setStnnum(103);
				aDialog = new Dialog3Choice(this); // ���꿪103 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 890) && (e.getX() < 900)) && ((e.getY() > 146) && (e.getY() < 156))) {
				metroVO.setStnnum(104);
				aDialog = new Dialog3Choice(this); // �νǿ�104 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 872) && (e.getX() < 882)) && ((e.getY() > 174) && (e.getY() < 184))) {
				metroVO.setStnnum(105);
				aDialog = new Dialog3Choice(this); // ������105 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 853) && (e.getX() < 863)) && ((e.getY() > 201) && (e.getY() < 211))) {
				metroVO.setStnnum(106);
				aDialog = new Dialog3Choice(this); // ������106 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 831) && (e.getX() < 841)) && ((e.getY() > 229) && (e.getY() < 239))) {
				metroVO.setStnnum(107);
				aDialog = new Dialog3Choice(this); // �λ�뿪107 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 815) && (e.getX() < 825)) && ((e.getY() > 256) && (e.getY() < 266))) {
				metroVO.setStnnum(108);
				aDialog = new Dialog3Choice(this); // ��õ�忪108 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 796) && (e.getX() < 806)) && ((e.getY() > 284) && (e.getY() < 294))) {
				metroVO.setStnnum(109);
				aDialog = new Dialog3Choice(this); // �����109 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 773) && (e.getX() < 793)) && ((e.getY() > 307) && (e.getY() < 327))) {
				metroVO.setStnnum(110);
				aDialog = new Dialog3Choice(this); // ������110 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 746) && (e.getX() < 756)) && ((e.getY() > 357) && (e.getY() < 367))) {
				metroVO.setStnnum(111);
				aDialog = new Dialog3Choice(this); // ���뿪111 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 707) && (e.getX() < 727)) && ((e.getY() > 402) && (e.getY() < 422))) {
				metroVO.setStnnum(112);
				aDialog = new Dialog3Choice(this); // ���꿪112 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 696) && (e.getX() < 706)) && ((e.getY() > 431) && (e.getY() < 441))) {
				metroVO.setStnnum(113);
				aDialog = new Dialog3Choice(this); // ��û��113 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 676) && (e.getX() < 686)) && ((e.getY() > 458) && (e.getY() < 468))) {
				metroVO.setStnnum(114);
				aDialog = new Dialog3Choice(this); // ������114 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 658) && (e.getX() < 668)) && ((e.getY() > 485) && (e.getY() < 495))) {
				metroVO.setStnnum(115);
				aDialog = new Dialog3Choice(this); // ������115 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 636) && (e.getX() < 656)) && ((e.getY() > 510) && (e.getY() < 530))) {
				metroVO.setStnnum(116);
				aDialog = new Dialog3Choice(this); // ���鿪116 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 621) && (e.getX() < 631)) && ((e.getY() > 541) && (e.getY() < 551))) {
				metroVO.setStnnum(117);
				aDialog = new Dialog3Choice(this); // ������117 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 602) && (e.getX() < 612)) && ((e.getY() > 569) && (e.getY() < 579))) {
				metroVO.setStnnum(118);
				aDialog = new Dialog3Choice(this); // ���Ͽ�118 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 584) && (e.getX() < 594)) && ((e.getY() > 596) && (e.getY() < 606))) {
				metroVO.setStnnum(119);
				aDialog = new Dialog3Choice(this); // ��õ��119 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 564) && (e.getX() < 574)) && ((e.getY() > 623) && (e.getY() < 633))) {
				metroVO.setStnnum(120);
				aDialog = new Dialog3Choice(this); // �λ�����120 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 545) && (e.getX() < 555)) && ((e.getY() > 651) && (e.getY() < 661))) {
				metroVO.setStnnum(121);
				aDialog = new Dialog3Choice(this); // �ʷ���121 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 526) && (e.getX() < 536)) && ((e.getY() > 678) && (e.getY() < 688))) {
				metroVO.setStnnum(122);
				aDialog = new Dialog3Choice(this); // �λ꿪122 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 497) && (e.getX() < 507)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(123);
				aDialog = new Dialog3Choice(this); // �߾ӿ�123 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 452) && (e.getX() < 462)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(124);
				aDialog = new Dialog3Choice(this); // ������124 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 406) && (e.getX() < 416)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(125);
				aDialog = new Dialog3Choice(this); // �ڰ�ġ��125 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 361) && (e.getX() < 371)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(126);
				aDialog = new Dialog3Choice(this); // �伺��126 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 313) && (e.getX() < 323)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(127);
				aDialog = new Dialog3Choice(this); // ����ſ�127 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 261) && (e.getX() < 271)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(128);
				aDialog = new Dialog3Choice(this); // ����ſ�128 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 223) && (e.getX() < 233)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(129);
				aDialog = new Dialog3Choice(this); // ��Ƽ��129 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 183) && (e.getX() < 193)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(130);
				aDialog = new Dialog3Choice(this); // ������130 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 155) && (e.getX() < 165)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(131);
				aDialog = new Dialog3Choice(this); // ���Ͽ�131Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 122) && (e.getX() < 132)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(132);
				aDialog = new Dialog3Choice(this); // �縮��132Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 89) && (e.getX() < 99)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(133);
				aDialog = new Dialog3Choice(this); // �ϴܿ�133 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 53) && (e.getX() < 63)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(134);
				aDialog = new Dialog3Choice(this); // ����134 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			//////////////////////////////////////////////////////////////////////////////////////// 2ȣ��
			if (((e.getX() > 484) && (e.getX() < 494)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(201);
				aDialog = new Dialog3Choice(this); // ��꿪201 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 440) && (e.getX() < 450)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(202);
				aDialog = new Dialog3Choice(this); // ����꿪202 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 365) && (e.getX() < 375)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(203);
				aDialog = new Dialog3Choice(this); // �λ����ķ�۽���203 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 295) && (e.getX() < 305)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(204);
				aDialog = new Dialog3Choice(this); // ���꿪204 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 174) && (e.getY() < 184))) {
				metroVO.setStnnum(205);
				aDialog = new Dialog3Choice(this); // ȣ����205 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 206) && (e.getY() < 216))) {
				metroVO.setStnnum(206);
				aDialog = new Dialog3Choice(this); // �ݰ206 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 236) && (e.getY() < 246))) {
				metroVO.setStnnum(207);
				aDialog = new Dialog3Choice(this); // ������207 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 267) && (e.getY() < 277))) {
				metroVO.setStnnum(208);
				aDialog = new Dialog3Choice(this); // ������208 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 298) && (e.getY() < 308))) {
				metroVO.setStnnum(209);
				aDialog = new Dialog3Choice(this); // ȭ��209 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 329) && (e.getY() < 339))) {
				metroVO.setStnnum(210);
				aDialog = new Dialog3Choice(this); // ������210 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 249) && (e.getX() < 269)) && ((e.getY() > 369) && (e.getY() < 389))) {
				metroVO.setStnnum(211);
				aDialog = new Dialog3Choice(this); // ��õ��211 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 406) && (e.getY() < 416))) {
				metroVO.setStnnum(212);
				aDialog = new Dialog3Choice(this); // ����212 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 438) && (e.getY() < 448))) {
				metroVO.setStnnum(213);
				aDialog = new Dialog3Choice(this); // ������213 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 470) && (e.getY() < 480))) {
				metroVO.setStnnum(214);
				aDialog = new Dialog3Choice(this); // ���214 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 283) && (e.getX() < 293)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(215);
				aDialog = new Dialog3Choice(this); // �����215 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 316) && (e.getX() < 326)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(216);
				aDialog = new Dialog3Choice(this); // ������216 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 344) && (e.getX() < 364)) && ((e.getY() > 507) && (e.getY() < 527))) {
				metroVO.setStnnum(217);
				aDialog = new Dialog3Choice(this); // ���217 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 383) && (e.getX() < 393)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(218);
				aDialog = new Dialog3Choice(this); // ������218 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 416) && (e.getX() < 426)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(219);
				aDialog = new Dialog3Choice(this); // �ַʿ�219 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 450) && (e.getX() < 460)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(220);
				aDialog = new Dialog3Choice(this); // ������220 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 483) && (e.getX() < 493)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(221);
				aDialog = new Dialog3Choice(this); // ���ݿ�221 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 517) && (e.getX() < 527)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(222);
				aDialog = new Dialog3Choice(this); // ���Ǵ뿪222 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 549) && (e.getX() < 559)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(223);
				aDialog = new Dialog3Choice(this); // ���߿�223 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 582) && (e.getX() < 592)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(224);
				aDialog = new Dialog3Choice(this); // �ξϿ�224 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 671) && (e.getX() < 681)) && ((e.getY() > 554) && (e.getY() < 564))) {
				metroVO.setStnnum(226);
				aDialog = new Dialog3Choice(this); // ������226 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 699) && (e.getX() < 709)) && ((e.getY() > 585) && (e.getY() < 595))) {
				metroVO.setStnnum(227);
				aDialog = new Dialog3Choice(this); // ������������,�λ����࿪227 Ŭ�����콺������
													// �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 725) && (e.getX() < 735)) && ((e.getY() > 617) && (e.getY() < 627))) {
				metroVO.setStnnum(228);
				aDialog = new Dialog3Choice(this); // ������228 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 752) && (e.getX() < 762)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(229);
				aDialog = new Dialog3Choice(this); // ���԰�229 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 787) && (e.getX() < 797)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(230);
				aDialog = new Dialog3Choice(this); // ����230 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 821) && (e.getX() < 831)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(231);
				aDialog = new Dialog3Choice(this); // �뿬��231 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 856) && (e.getX() < 866)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(232);
				aDialog = new Dialog3Choice(this); // �漺��,�ΰ�뿪232 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 872) && (e.getX() < 882)) && ((e.getY() > 627) && (e.getY() < 637))) {
				metroVO.setStnnum(233);
				aDialog = new Dialog3Choice(this); // ��õ��233 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 891) && (e.getX() < 901)) && ((e.getY() > 597) && (e.getY() < 607))) {
				metroVO.setStnnum(234);
				aDialog = new Dialog3Choice(this); // �ݷû꿪234 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 911) && (e.getX() < 921)) && ((e.getY() > 566) && (e.getY() < 576))) {
				metroVO.setStnnum(235);
				aDialog = new Dialog3Choice(this); // ���ȿ�235 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 927) && (e.getX() < 947)) && ((e.getY() > 533) && (e.getY() < 553))) {
				metroVO.setStnnum(236);
				aDialog = new Dialog3Choice(this); // ������236 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 957) && (e.getX() < 967)) && ((e.getY() > 499) && (e.getY() < 509))) {
				metroVO.setStnnum(237);
				aDialog = new Dialog3Choice(this); // �ζ���237 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 979) && (e.getX() < 989)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(238);
				aDialog = new Dialog3Choice(this); // ���ҽ�Ƽ��238 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1021) && (e.getX() < 1031)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(239);
				aDialog = new Dialog3Choice(this); // �ø��̼�����239 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1072) && (e.getX() < 1082)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(240);
				aDialog = new Dialog3Choice(this); // ���鿪240 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1114) && (e.getX() < 1124)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(241);
				aDialog = new Dialog3Choice(this); // �ؿ�뿪241 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1155) && (e.getX() < 1165)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(242);
				aDialog = new Dialog3Choice(this); // �ߵ���242 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1189) && (e.getX() < 1199)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(243);
				aDialog = new Dialog3Choice(this); // ��꿪243 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			///////////////////////////////////////////////////////////////////////////////// 3ȣ��
			if (((e.getX() > 61) && (e.getX() < 81)) && ((e.getY() > 368) && (e.getY() < 388))) {
				metroVO.setStnnum(301);
				aDialog = new Dialog3Choice(this); // ������301 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 117) && (e.getX() < 127)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(302);
				aDialog = new Dialog3Choice(this); // ü��������302 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 175) && (e.getX() < 185)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(303);
				aDialog = new Dialog3Choice(this); // ������û��303 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 221) && (e.getX() < 231)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(304);
				aDialog = new Dialog3Choice(this); // ������304 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 324) && (e.getX() < 334)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(306);
				aDialog = new Dialog3Choice(this); // ���306 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 385) && (e.getX() < 395)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(307);
				aDialog = new Dialog3Choice(this); // ��������307 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 437) && (e.getX() < 447)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(308);
				aDialog = new Dialog3Choice(this); // ������308 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 493) && (e.getX() < 503)) && ((e.getY() > 368) && (e.getY() < 388))) {
				metroVO.setStnnum(309);
				aDialog = new Dialog3Choice(this); // �̳���309 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 553) && (e.getX() < 563)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(310);
				aDialog = new Dialog3Choice(this); // ������310 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 611) && (e.getX() < 621)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(311);
				aDialog = new Dialog3Choice(this); // ���տ�忪311 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 669) && (e.getX() < 679)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(312);
				aDialog = new Dialog3Choice(this); // ������312 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 747) && (e.getX() < 757)) && ((e.getY() > 447) && (e.getY() < 457))) {
				metroVO.setStnnum(314);
				aDialog = new Dialog3Choice(this); // ������314 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 786) && (e.getX() < 796)) && ((e.getY() > 492) && (e.getY() < 502))) {
				metroVO.setStnnum(315);
				aDialog = new Dialog3Choice(this); // ��꿪315 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 824) && (e.getX() < 834)) && ((e.getY() > 536) && (e.getY() < 546))) {
				metroVO.setStnnum(316);
				aDialog = new Dialog3Choice(this); // ���̿�316 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			/////////////////////////////////////////////////////////////////////////////////////// 4ȣ��
			if (((e.getX() > 1190) && (e.getX() < 1200)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(401);
				aDialog = new Dialog3Choice(this); // ����401 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1153) && (e.getX() < 1163)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(402);
				aDialog = new Dialog3Choice(this); // ���̿�402 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1112) && (e.getX() < 1122)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(403);
				aDialog = new Dialog3Choice(this); // ���λ���п�403 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1072) && (e.getX() < 1082)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(404);
				aDialog = new Dialog3Choice(this); // ����뿪404 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1033) && (e.getX() < 1043)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(405);
				aDialog = new Dialog3Choice(this); // ���뿪405 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 997) && (e.getX() < 1007)) && ((e.getY() > 362) && (e.getY() < 372))) {
				metroVO.setStnnum(406);
				aDialog = new Dialog3Choice(this); // �ݿ���깰���忪406 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 981) && (e.getX() < 991)) && ((e.getY() > 344) && (e.getY() < 354))) {
				metroVO.setStnnum(407);
				aDialog = new Dialog3Choice(this); // �ݻ翪407 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 964) && (e.getX() < 974)) && ((e.getY() > 326) && (e.getY() < 336))) {
				metroVO.setStnnum(408);
				aDialog = new Dialog3Choice(this); // ������408 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 940) && (e.getX() < 950)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(409);
				aDialog = new Dialog3Choice(this); // ���忪409 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 901) && (e.getX() < 911)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(410);
				aDialog = new Dialog3Choice(this); // ��Ļ翪410 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 862) && (e.getX() < 872)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(411);
				aDialog = new Dialog3Choice(this); // ���ο�411 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 821) && (e.getX() < 831)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(412);
				aDialog = new Dialog3Choice(this); // ���ȿ�412 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			////////////////////////////////////////////////////////////////////////////////// 5ȣ��
			if (((e.getX() > 584) && (e.getX() < 594)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(501);
				aDialog = new Dialog3Choice(this); // ���ߴ뿪501 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 516) && (e.getX() < 526)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(502);
				aDialog = new Dialog3Choice(this); // ��Ŵ뿪502 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 448) && (e.getX() < 458)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(503);
				aDialog = new Dialog3Choice(this); // ����������503 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 380) && (e.getX() < 390)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(504);
				aDialog = new Dialog3Choice(this); // �ڹ�����504 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 311) && (e.getX() < 321)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(505);
				aDialog = new Dialog3Choice(this); // ���οո���505 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 241) && (e.getX() < 251)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(506);
				aDialog = new Dialog3Choice(this); // ��Ȳ��506 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 174) && (e.getX() < 184)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(507);
				aDialog = new Dialog3Choice(this); // �ο���507 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 106) && (e.getX() < 116)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(508);
				aDialog = new Dialog3Choice(this); // ���ؽ�û��508 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 107) && (e.getY() < 117))) {
				metroVO.setStnnum(509);
				aDialog = new Dialog3Choice(this); // ������509 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 152) && (e.getY() < 195))) {
				metroVO.setStnnum(510);
				aDialog = new Dialog3Choice(this); // ���ش��п�510 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 195) && (e.getY() < 205))) {
				metroVO.setStnnum(511);
				aDialog = new Dialog3Choice(this); // ������511 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 239) && (e.getY() < 249))) {
				metroVO.setStnnum(512);
				aDialog = new Dialog3Choice(this); // �ҾϿ�512 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 283) && (e.getY() < 293))) {
				metroVO.setStnnum(513);
				aDialog = new Dialog3Choice(this); // ��翪513 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 329) && (e.getY() < 339))) {
				metroVO.setStnnum(514);
				aDialog = new Dialog3Choice(this); // �򰭿�514 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 426) && (e.getY() < 436))) {
				metroVO.setStnnum(516);
				aDialog = new Dialog3Choice(this); // ���516 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 464) && (e.getY() < 474))) {
				metroVO.setStnnum(517);
				aDialog = new Dialog3Choice(this); // ���ο�517 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 503) && (e.getY() < 513))) {
				metroVO.setStnnum(518);
				aDialog = new Dialog3Choice(this); // ���׿�518 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 146) && (e.getX() < 156)) && ((e.getY() > 547) && (e.getY() < 557))) {
				metroVO.setStnnum(519);
				aDialog = new Dialog3Choice(this); // ���λ�����������519 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 265) && (e.getX() < 275)) && ((e.getY() > 547) && (e.getY() < 557))) {
				metroVO.setStnnum(520);
				aDialog = new Dialog3Choice(this); // �������׽ö���520 Ŭ�����콺������ �۵�
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}
	}

	// ���θ޼ҵ�
	public static void main(String[] args) {
		MetroMapFrame m = new MetroMapFrame();

	}

	// ���̾�α� Ŭ����
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	// ��߿�, ������, ������ ���� ���̾�α�
	class Dialog3Choice extends JDialog {
		JPanel p1, p2;
		JLabel l;
		JButton departButton = new JButton("��߿�"); // ��ư�� ���� �׼Ǹ����� �����ؾ���.
		JButton arriveButton = new JButton("������");
		JButton informButton = new JButton("������");
		private DialogStnResult resultDialog;
		private DialogCalcResult calcDialog;

		Dialog3Choice(MyMouseListener myMouseListener) {
			super();
			p1 = new JPanel();
			p1.setLayout(new FlowLayout());
			p1.add(departButton);
			p1.add(arriveButton);
			p1.add(informButton);

			departButton.addActionListener(new ActionListener() { // ��߿� ��ư
																	// �׼Ǹ�����
				@Override
				public void actionPerformed(ActionEvent e) {
					departmetroVO = metroDao.selectStationWhere(metroVO.getStnnum());
					aDialog.setVisible(false);
					System.out.println("��߿�:" + departmetroVO.getStnnum());
					departStn = departmetroVO.getStnnum();

				}
			});

			arriveButton.addActionListener(new ActionListener() { // ������ ��ư
																	// �׼Ǹ�����
				@Override
				public void actionPerformed(ActionEvent e) {
					arrivemetroVO = metroDao.selectStationWhere(metroVO.getStnnum());
					aDialog.setVisible(false);
					System.out.println("������:" + arrivemetroVO.getStnnum());
					arriveStn = arrivemetroVO.getStnnum();
					RouteCal r = new RouteCal(departStn, arriveStn);
					currentHour = LocalTime.now().getHour();
					currentMinute = LocalTime.now().getMinute();
					ArrivalHour = currentHour;
					ArrivalMinute = currentMinute + r.getDistance();

					calcDialog = new DialogCalcResult(this);
					calcDialog.setVisible(true);
					//////////////////////// ��� ���̾�α� �ҷ��;ߵ�

				}
			});
			informButton.addActionListener(new ActionListener() { // ������ ��ư
																	// �׼Ǹ�����
				@Override
				public void actionPerformed(ActionEvent e) {
					resultDialog = new DialogStnResult(this);
					resultDialog.setVisible(true);
				}
			});

			metroDao.createConnection();
			metroVO = metroDao.selectStationWhere(metroVO.getStnnum());
			add(p1);
			setBackground(Color.white);
			setSize(300, 75);
			setTitle(metroVO.getStn() + "��");
			setLocationRelativeTo(metroMapPanel);

		}
	}

	// ������ ��� ���̾�α�
	class DialogStnResult extends JDialog {
		StnResultPanel stnResultPanel = new StnResultPanel();

		DialogStnResult(ActionListener actionListener) {

			metroVO = metroDao.selectStationWhere(metroVO.getStnnum());
			setTitle(metroVO.getStn() + "��");
			metroVO = metroVOnull;

			add(stnResultPanel);
			aDialog.requestFocus();
			setSize(362, 208);
			setLocationRelativeTo(metroMapPanel);
		}
	}

	// �ִܽð� ��� ��� ���̾�α�
	class DialogCalcResult extends JDialog {
		CalcResultPanel calcResultPanel = new CalcResultPanel();
		RouteCal routecal = new RouteCal(arriveStn, departStn);

		int d = 0; ///// ���ÿ�
		int h = 9; ///// ���ÿ�
		int m = 58; ///// ���ÿ�
		String depart = "���"; ///// ���ÿ�
		String arrive = "����"; ///// ���ÿ�
		String transfer1 = "ȯ��1"; ///// ���ÿ�
		String transfer2 = "ȯ��2"; ///// ���ÿ�
		String transfer3 = "ȯ��3"; ///// ���ÿ�
		

		JPanel panelLeft = new JPanel();
		JPanel panelRight = new JPanel();
		ImageIcon lane1 = new ImageIcon("line1.png");
		ImageIcon lane2 = new ImageIcon("line2.png");
		ImageIcon lane3 = new ImageIcon("line3.png");
		ImageIcon lane4 = new ImageIcon("line4.png");
		ImageIcon lane5 = new ImageIcon("line5.png");
		ImageIcon arrow = new ImageIcon("arrow.png");
		ImageIcon rope = new ImageIcon("rope.png");
		ImageIcon QR = new ImageIcon("QRCodeImg.jpg");
		JButton btn = new JButton("Ȯ��");
		JLabel departLabel = new JLabel(departmetroVO.getStn()); /// ��߿��� VO.Stn �� ���;ߵ�
		JLabel arriveLabel = new JLabel(arrivemetroVO.getStn()); /// �������� VO.Stn �� ���;ߵ�
		JLabel transfer1Label = new JLabel(transfer1); /// ȯ�¿�1�� VO.Stn�� ���;ߵ�
		JLabel transfer1Labe2 = new JLabel(transfer2); /// ȯ�¿�2�� VO.Stn�� ���;ߵ�
		JLabel transfer1Labe3 = new JLabel(transfer3); /// ȯ�¿�3�� VO.Stn�� ���;ߵ�

		DialogCalcResult(ActionListener actionListener) {
			if(ArrivalMinute>=60){
				ArrivalHour++;
				ArrivalMinute = ArrivalMinute%60;
				Arrival = ArrivalMinute+"";
				if(ArrivalMinute<10){
					Arrival = ("0"+ArrivalMinute);}
			} else if(ArrivalMinute<10){
				Arrival = ("0"+ArrivalMinute);
			}
			

						
			JLabel line1Label = new JLabel(lane1); /// 1ȣ�� �̹��� ��
			JLabel line1Labela = new JLabel(lane1);
			JLabel line2Label = new JLabel(lane2); /// 2ȣ�� �̹��� ��
			JLabel line2Labela = new JLabel(lane2);
			JLabel line3Label = new JLabel(lane3); /// 3ȣ�� �̹��� ��
			JLabel line3Labela = new JLabel(lane3);
			JLabel line4Label = new JLabel(lane4); /// 4ȣ�� �̹��� ��
			JLabel line4Labela = new JLabel(lane4);
			JLabel line5Label = new JLabel(lane5); /// 5ȣ�� �̹��� ��
			JLabel line5Labela = new JLabel(lane5);
			JLabel arrowLabel1 = new JLabel(arrow); /// ȭ��ǥ1 �̹��� ��
			JLabel arrowLabel2 = new JLabel(arrow); /// ȭ��ǥ2 �̹��� ��
			JLabel arrowLabel3 = new JLabel(arrow); /// ȭ��ǥ3 �̹��� ��
			JLabel ropeLabel = new JLabel(rope); /// ������ ��츦 ���� rope
			JLabel qr = new JLabel(QR);
			JLabel text1 = new JLabel("�ҿ�ð�                       ");
			JLabel text2 = new JLabel("��߽ð�                 ");
			JLabel text3 = new JLabel(" �����ð�                       ");
			JLabel textSpace1 = new JLabel("                  "); //����
			JLabel textSpace2 = new JLabel("                                  "); //����
			JLabel textSpace3 = new JLabel("                                  "); //����
			
			
			
			JLabel realTime = new JLabel(currentHour + ":" + currentMinute);
			
////////////////��!!!!��!!!!��!!!!!��!!!!! �ҿ�ð�!!!!!!! �� �ҷ��;ߵ�!!!!///////////////////////
			JLabel duration = new JLabel(routecal.getDistance() + " ��"); 

///////////////��!!!!��!!!!��!!!!��!!!!!! �����ð�!!!!!!! �ö� �� �ٿ��ߵ�!!!!!!!//////////////////
			JLabel arriveTime = new JLabel(ArrivalHour + ":" + Arrival);
			
			// ������ΰ� ��������� ��ġ, ũ��, ����
			panelLeft.setBackground(Color.white);
			panelLeft.setLocation(15, 80);
			panelLeft.setSize(100, 435);
			panelRight.setBackground(Color.white);
			panelRight.setLocation(150, 80);
			panelRight.setSize(130, 435);

			if(departmetroVO.getStnline() == 1) {
				panelLeft.add(line1Label);
			} else if(departmetroVO.getStnline() == 2) {
				panelLeft.add(line2Label);
			} else if(departmetroVO.getStnline() == 3) {
				panelLeft.add(line3Label);
			} else if(departmetroVO.getStnline() == 4) {
				panelLeft.add(line4Label);
			} else if(departmetroVO.getStnline() == 5) {
				panelLeft.add(line5Label);
			} 
			panelLeft.add(departLabel);
			panelLeft.add(arrowLabel1);
			panelLeft.add(ropeLabel);
			panelLeft.add(arrowLabel2);
			if(arrivemetroVO.getStnline() == 1) {
				panelLeft.add(line1Labela);
			} else if(arrivemetroVO.getStnline() == 2) {
				panelLeft.add(line2Labela);
			} else if(arrivemetroVO.getStnline() == 3) {
				panelLeft.add(line3Labela);
			} else if(arrivemetroVO.getStnline() == 4) {
				panelLeft.add(line4Labela);
			} else if(arrivemetroVO.getStnline() == 5) {
				panelLeft.add(line5Labela);
			} 
			panelLeft.add(arriveLabel);
			

			// ��������� ���̱��Դϴ�.
			panelRight.add(text1); // �ҿ�ð�:
			panelRight.add(duration); // @@ ��
			duration.setFont(new Font("����", Font.BOLD, 40));
			panelRight.add(textSpace1);
			panelRight.add(text2); // <��߽ð�>
			panelRight.add(realTime);
			realTime.setFont(new Font("����", Font.BOLD, 40));
			panelRight.add(btn);
			btn.setBackground(Color.white);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					

					panelRight.add(text3);
					
					panelRight.add(arriveTime);
					arriveTime.setFont(new Font("����", Font.BOLD, 40));
					panelRight.add(qr);
				}
			});
//			panelRight.add(textSpace3);
//			panelRight.add(textSpace2);

			// ���̾�α׿� �������, ��������� ���̱�
			add(panelLeft);
			add(panelRight);
			add(calcResultPanel);

			// ���̾�α� �⺻����
			aDialog.requestFocus();
			setSize(326, 558);
			setLocationRelativeTo(metroMapPanel);
		}

	}

	// �� �Ʒ��� ��� �̹��� �׸��� �гε�.(Frame, Dialog)
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ����ö �뼱�� �̹��� �׸��� �г�
	class MapPanel extends JPanel {
		private BufferedImage img = null;

		public MapPanel() {
			setLayout(null);
			try {
				img = ImageIO.read(new File("Busan_subway.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	}

	// ������ ���â �׸��� �г�
	class StnResultPanel extends JPanel {
		private BufferedImage back = null;
		private BufferedImage transfer = null;
		private BufferedImage toilet = null;
		private BufferedImage storage = null;
		private BufferedImage otherside = null;

		public StnResultPanel() {
			setSize(362, 208);
			setLayout(null);
			try {
				back = ImageIO.read(new File("StnResult.png"));
				if (metroVO.getDijknum() == 0) {
					transfer = ImageIO.read(new File("No.png"));
				}
				if (metroVO.isToilet() == false) {
					toilet = ImageIO.read(new File("No.png"));
				}
				if (metroVO.isStorage() == false) {
					storage = ImageIO.read(new File("No.png"));
				}
				if (metroVO.isOtherside() == false) {
					otherside = ImageIO.read(new File("No.png"));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(back, 0, 0, null);
			g.drawImage(transfer, 28, 72, null);
			g.drawImage(toilet, 112, 72, null);
			g.drawImage(storage, 195, 72, null);
			g.drawImage(otherside, 273, 72, null);
		}
	}

	// �ִܽð� ���â �׸��� �г�
	class CalcResultPanel extends JPanel {
		private BufferedImage back = null;

		public CalcResultPanel() {

			setSize(326, 624);
			setLayout(null);
			try {
				back = ImageIO.read(new File("CalcResult.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(back, 0, 0, null);
		}
	}
}
