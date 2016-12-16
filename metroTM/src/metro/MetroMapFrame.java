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
	private Dialog3Choice aDialog; // 출발역, 도착역, 역정보 선택 다이얼로그
	private MapPanel metroMapPanel; // 노선도 이미지 그리기 패널
	final MetroVO metroVOnull = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); //초기화
	MetroVO metroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0);
	MetroVO departmetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 출발역
	MetroVO arrivemetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 도착역

	MetroDao metroDao = new MetroDao();
	
   	private int departStn;
	private int arriveStn;
	private int currentHour;
	private int currentMinute;
	private int ArrivalHour;
	private int ArrivalMinute;
	private String Arrival;
	

	public MetroMapFrame() {
		// 이미지 그리기
		metroMapPanel = new MapPanel();
		metroMapPanel.addMouseListener(new MyMouseListener());
		add(metroMapPanel);

		// 프레임 기본정보
		setSize(1275, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	class MyMouseListener implements MouseListener {
		// 범위 정보와 역번호를 지정
		@Override
		public void mouseClicked(MouseEvent e) {
			///////////////////////////////////////////////////////////////////////////////////// 1호선
			if (((e.getX() > 945) && (e.getX() < 955)) && ((e.getY() > 63) && (e.getY() < 73))) {
				metroVO.setStnnum(101);
				aDialog = new Dialog3Choice(this); // 노포역101 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 927) && (e.getX() < 937)) && ((e.getY() > 90) && (e.getY() < 100))) {
				metroVO.setStnnum(102);
				aDialog = new Dialog3Choice(this); // 범어사역102 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 909) && (e.getX() < 919)) && ((e.getY() > 118) && (e.getY() < 128))) {
				metroVO.setStnnum(103);
				aDialog = new Dialog3Choice(this); // 남산역103 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 890) && (e.getX() < 900)) && ((e.getY() > 146) && (e.getY() < 156))) {
				metroVO.setStnnum(104);
				aDialog = new Dialog3Choice(this); // 두실역104 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 872) && (e.getX() < 882)) && ((e.getY() > 174) && (e.getY() < 184))) {
				metroVO.setStnnum(105);
				aDialog = new Dialog3Choice(this); // 구서역105 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 853) && (e.getX() < 863)) && ((e.getY() > 201) && (e.getY() < 211))) {
				metroVO.setStnnum(106);
				aDialog = new Dialog3Choice(this); // 장전역106 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 831) && (e.getX() < 841)) && ((e.getY() > 229) && (e.getY() < 239))) {
				metroVO.setStnnum(107);
				aDialog = new Dialog3Choice(this); // 부산대역107 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 815) && (e.getX() < 825)) && ((e.getY() > 256) && (e.getY() < 266))) {
				metroVO.setStnnum(108);
				aDialog = new Dialog3Choice(this); // 온천장역108 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 796) && (e.getX() < 806)) && ((e.getY() > 284) && (e.getY() < 294))) {
				metroVO.setStnnum(109);
				aDialog = new Dialog3Choice(this); // 명륜역109 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 773) && (e.getX() < 793)) && ((e.getY() > 307) && (e.getY() < 327))) {
				metroVO.setStnnum(110);
				aDialog = new Dialog3Choice(this); // 동래역110 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 746) && (e.getX() < 756)) && ((e.getY() > 357) && (e.getY() < 367))) {
				metroVO.setStnnum(111);
				aDialog = new Dialog3Choice(this); // 교대역111 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 707) && (e.getX() < 727)) && ((e.getY() > 402) && (e.getY() < 422))) {
				metroVO.setStnnum(112);
				aDialog = new Dialog3Choice(this); // 연산역112 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 696) && (e.getX() < 706)) && ((e.getY() > 431) && (e.getY() < 441))) {
				metroVO.setStnnum(113);
				aDialog = new Dialog3Choice(this); // 시청역113 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 676) && (e.getX() < 686)) && ((e.getY() > 458) && (e.getY() < 468))) {
				metroVO.setStnnum(114);
				aDialog = new Dialog3Choice(this); // 양정역114 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 658) && (e.getX() < 668)) && ((e.getY() > 485) && (e.getY() < 495))) {
				metroVO.setStnnum(115);
				aDialog = new Dialog3Choice(this); // 부전역115 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 636) && (e.getX() < 656)) && ((e.getY() > 510) && (e.getY() < 530))) {
				metroVO.setStnnum(116);
				aDialog = new Dialog3Choice(this); // 서면역116 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 621) && (e.getX() < 631)) && ((e.getY() > 541) && (e.getY() < 551))) {
				metroVO.setStnnum(117);
				aDialog = new Dialog3Choice(this); // 범내골역117 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 602) && (e.getX() < 612)) && ((e.getY() > 569) && (e.getY() < 579))) {
				metroVO.setStnnum(118);
				aDialog = new Dialog3Choice(this); // 범일역118 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 584) && (e.getX() < 594)) && ((e.getY() > 596) && (e.getY() < 606))) {
				metroVO.setStnnum(119);
				aDialog = new Dialog3Choice(this); // 좌천역119 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 564) && (e.getX() < 574)) && ((e.getY() > 623) && (e.getY() < 633))) {
				metroVO.setStnnum(120);
				aDialog = new Dialog3Choice(this); // 부산진역120 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 545) && (e.getX() < 555)) && ((e.getY() > 651) && (e.getY() < 661))) {
				metroVO.setStnnum(121);
				aDialog = new Dialog3Choice(this); // 초량역121 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 526) && (e.getX() < 536)) && ((e.getY() > 678) && (e.getY() < 688))) {
				metroVO.setStnnum(122);
				aDialog = new Dialog3Choice(this); // 부산역122 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 497) && (e.getX() < 507)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(123);
				aDialog = new Dialog3Choice(this); // 중앙역123 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 452) && (e.getX() < 462)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(124);
				aDialog = new Dialog3Choice(this); // 남포역124 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 406) && (e.getX() < 416)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(125);
				aDialog = new Dialog3Choice(this); // 자갈치역125 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 361) && (e.getX() < 371)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(126);
				aDialog = new Dialog3Choice(this); // 토성역126 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 313) && (e.getX() < 323)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(127);
				aDialog = new Dialog3Choice(this); // 동대신역127 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 261) && (e.getX() < 271)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(128);
				aDialog = new Dialog3Choice(this); // 서대신역128 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 223) && (e.getX() < 233)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(129);
				aDialog = new Dialog3Choice(this); // 대티역129 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 183) && (e.getX() < 193)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(130);
				aDialog = new Dialog3Choice(this); // 괴정역130 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 155) && (e.getX() < 165)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(131);
				aDialog = new Dialog3Choice(this); // 사하역131클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 122) && (e.getX() < 132)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(132);
				aDialog = new Dialog3Choice(this); // 당리역132클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 89) && (e.getX() < 99)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(133);
				aDialog = new Dialog3Choice(this); // 하단역133 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 53) && (e.getX() < 63)) && ((e.getY() > 698) && (e.getY() < 708))) {
				metroVO.setStnnum(134);
				aDialog = new Dialog3Choice(this); // 신평역134 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			//////////////////////////////////////////////////////////////////////////////////////// 2호선
			if (((e.getX() > 484) && (e.getX() < 494)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(201);
				aDialog = new Dialog3Choice(this); // 양산역201 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 440) && (e.getX() < 450)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(202);
				aDialog = new Dialog3Choice(this); // 남양산역202 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 365) && (e.getX() < 375)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(203);
				aDialog = new Dialog3Choice(this); // 부산대양산캠퍼스역203 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 295) && (e.getX() < 305)) && ((e.getY() > 133) && (e.getY() < 143))) {
				metroVO.setStnnum(204);
				aDialog = new Dialog3Choice(this); // 증산역204 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 174) && (e.getY() < 184))) {
				metroVO.setStnnum(205);
				aDialog = new Dialog3Choice(this); // 호포역205 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 206) && (e.getY() < 216))) {
				metroVO.setStnnum(206);
				aDialog = new Dialog3Choice(this); // 금곡역206 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 236) && (e.getY() < 246))) {
				metroVO.setStnnum(207);
				aDialog = new Dialog3Choice(this); // 동원역207 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 267) && (e.getY() < 277))) {
				metroVO.setStnnum(208);
				aDialog = new Dialog3Choice(this); // 율리역208 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 298) && (e.getY() < 308))) {
				metroVO.setStnnum(209);
				aDialog = new Dialog3Choice(this); // 화명역209 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 329) && (e.getY() < 339))) {
				metroVO.setStnnum(210);
				aDialog = new Dialog3Choice(this); // 수정역210 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 249) && (e.getX() < 269)) && ((e.getY() > 369) && (e.getY() < 389))) {
				metroVO.setStnnum(211);
				aDialog = new Dialog3Choice(this); // 덕천역211 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 406) && (e.getY() < 416))) {
				metroVO.setStnnum(212);
				aDialog = new Dialog3Choice(this); // 구명역212 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 438) && (e.getY() < 448))) {
				metroVO.setStnnum(213);
				aDialog = new Dialog3Choice(this); // 구남역213 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 254) && (e.getX() < 264)) && ((e.getY() > 470) && (e.getY() < 480))) {
				metroVO.setStnnum(214);
				aDialog = new Dialog3Choice(this); // 모라역214 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 283) && (e.getX() < 293)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(215);
				aDialog = new Dialog3Choice(this); // 모덕역215 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 316) && (e.getX() < 326)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(216);
				aDialog = new Dialog3Choice(this); // 덕포역216 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 344) && (e.getX() < 364)) && ((e.getY() > 507) && (e.getY() < 527))) {
				metroVO.setStnnum(217);
				aDialog = new Dialog3Choice(this); // 사상역217 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 383) && (e.getX() < 393)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(218);
				aDialog = new Dialog3Choice(this); // 감전역218 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 416) && (e.getX() < 426)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(219);
				aDialog = new Dialog3Choice(this); // 주례역219 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 450) && (e.getX() < 460)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(220);
				aDialog = new Dialog3Choice(this); // 냉정역220 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 483) && (e.getX() < 493)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(221);
				aDialog = new Dialog3Choice(this); // 개금역221 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 517) && (e.getX() < 527)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(222);
				aDialog = new Dialog3Choice(this); // 동의대역222 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 549) && (e.getX() < 559)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(223);
				aDialog = new Dialog3Choice(this); // 가야역223 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 582) && (e.getX() < 592)) && ((e.getY() > 512) && (e.getY() < 522))) {
				metroVO.setStnnum(224);
				aDialog = new Dialog3Choice(this); // 부암역224 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 671) && (e.getX() < 681)) && ((e.getY() > 554) && (e.getY() < 564))) {
				metroVO.setStnnum(226);
				aDialog = new Dialog3Choice(this); // 전포역226 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 699) && (e.getX() < 709)) && ((e.getY() > 585) && (e.getY() < 595))) {
				metroVO.setStnnum(227);
				aDialog = new Dialog3Choice(this); // 국제금융센터,부산은행역227 클릭마우스리스너
													// 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 725) && (e.getX() < 735)) && ((e.getY() > 617) && (e.getY() < 627))) {
				metroVO.setStnnum(228);
				aDialog = new Dialog3Choice(this); // 문현역228 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 752) && (e.getX() < 762)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(229);
				aDialog = new Dialog3Choice(this); // 지게골역229 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 787) && (e.getX() < 797)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(230);
				aDialog = new Dialog3Choice(this); // 못골역230 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 821) && (e.getX() < 831)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(231);
				aDialog = new Dialog3Choice(this); // 대연역231 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 856) && (e.getX() < 866)) && ((e.getY() > 648) && (e.getY() < 658))) {
				metroVO.setStnnum(232);
				aDialog = new Dialog3Choice(this); // 경성대,부경대역232 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 872) && (e.getX() < 882)) && ((e.getY() > 627) && (e.getY() < 637))) {
				metroVO.setStnnum(233);
				aDialog = new Dialog3Choice(this); // 남천역233 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 891) && (e.getX() < 901)) && ((e.getY() > 597) && (e.getY() < 607))) {
				metroVO.setStnnum(234);
				aDialog = new Dialog3Choice(this); // 금련산역234 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 911) && (e.getX() < 921)) && ((e.getY() > 566) && (e.getY() < 576))) {
				metroVO.setStnnum(235);
				aDialog = new Dialog3Choice(this); // 광안역235 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 927) && (e.getX() < 947)) && ((e.getY() > 533) && (e.getY() < 553))) {
				metroVO.setStnnum(236);
				aDialog = new Dialog3Choice(this); // 수영역236 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 957) && (e.getX() < 967)) && ((e.getY() > 499) && (e.getY() < 509))) {
				metroVO.setStnnum(237);
				aDialog = new Dialog3Choice(this); // 민락역237 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 979) && (e.getX() < 989)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(238);
				aDialog = new Dialog3Choice(this); // 센텀시티역238 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1021) && (e.getX() < 1031)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(239);
				aDialog = new Dialog3Choice(this); // 시립미술관역239 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1072) && (e.getX() < 1082)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(240);
				aDialog = new Dialog3Choice(this); // 동백역240 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1114) && (e.getX() < 1124)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(241);
				aDialog = new Dialog3Choice(this); // 해운대역241 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1155) && (e.getX() < 1165)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(242);
				aDialog = new Dialog3Choice(this); // 중동역242 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1189) && (e.getX() < 1199)) && ((e.getY() > 468) && (e.getY() < 478))) {
				metroVO.setStnnum(243);
				aDialog = new Dialog3Choice(this); // 장산역243 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			///////////////////////////////////////////////////////////////////////////////// 3호선
			if (((e.getX() > 61) && (e.getX() < 81)) && ((e.getY() > 368) && (e.getY() < 388))) {
				metroVO.setStnnum(301);
				aDialog = new Dialog3Choice(this); // 대저역301 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 117) && (e.getX() < 127)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(302);
				aDialog = new Dialog3Choice(this); // 체육공원역302 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 175) && (e.getX() < 185)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(303);
				aDialog = new Dialog3Choice(this); // 강서구청역303 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 221) && (e.getX() < 231)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(304);
				aDialog = new Dialog3Choice(this); // 구포역304 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 324) && (e.getX() < 334)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(306);
				aDialog = new Dialog3Choice(this); // 숙등역306 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 385) && (e.getX() < 395)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(307);
				aDialog = new Dialog3Choice(this); // 남산정역307 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 437) && (e.getX() < 447)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(308);
				aDialog = new Dialog3Choice(this); // 만덕역308 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 493) && (e.getX() < 503)) && ((e.getY() > 368) && (e.getY() < 388))) {
				metroVO.setStnnum(309);
				aDialog = new Dialog3Choice(this); // 미남역309 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 553) && (e.getX() < 563)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(310);
				aDialog = new Dialog3Choice(this); // 사직역310 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 611) && (e.getX() < 621)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(311);
				aDialog = new Dialog3Choice(this); // 종합운동장역311 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 669) && (e.getX() < 679)) && ((e.getY() > 373) && (e.getY() < 383))) {
				metroVO.setStnnum(312);
				aDialog = new Dialog3Choice(this); // 거제역312 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 747) && (e.getX() < 757)) && ((e.getY() > 447) && (e.getY() < 457))) {
				metroVO.setStnnum(314);
				aDialog = new Dialog3Choice(this); // 물만골역314 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 786) && (e.getX() < 796)) && ((e.getY() > 492) && (e.getY() < 502))) {
				metroVO.setStnnum(315);
				aDialog = new Dialog3Choice(this); // 배산역315 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 824) && (e.getX() < 834)) && ((e.getY() > 536) && (e.getY() < 546))) {
				metroVO.setStnnum(316);
				aDialog = new Dialog3Choice(this); // 망미역316 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			/////////////////////////////////////////////////////////////////////////////////////// 4호선
			if (((e.getX() > 1190) && (e.getX() < 1200)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(401);
				aDialog = new Dialog3Choice(this); // 안평역401 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1153) && (e.getX() < 1163)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(402);
				aDialog = new Dialog3Choice(this); // 고촌역402 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1112) && (e.getX() < 1122)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(403);
				aDialog = new Dialog3Choice(this); // 동부산대학역403 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1072) && (e.getX() < 1082)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(404);
				aDialog = new Dialog3Choice(this); // 영산대역404 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 1033) && (e.getX() < 1043)) && ((e.getY() > 372) && (e.getY() < 382))) {
				metroVO.setStnnum(405);
				aDialog = new Dialog3Choice(this); // 석대역405 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 997) && (e.getX() < 1007)) && ((e.getY() > 362) && (e.getY() < 372))) {
				metroVO.setStnnum(406);
				aDialog = new Dialog3Choice(this); // 반여농산물시장역406 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 981) && (e.getX() < 991)) && ((e.getY() > 344) && (e.getY() < 354))) {
				metroVO.setStnnum(407);
				aDialog = new Dialog3Choice(this); // 금사역407 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 964) && (e.getX() < 974)) && ((e.getY() > 326) && (e.getY() < 336))) {
				metroVO.setStnnum(408);
				aDialog = new Dialog3Choice(this); // 서동역408 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 940) && (e.getX() < 950)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(409);
				aDialog = new Dialog3Choice(this); // 명장역409 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 901) && (e.getX() < 911)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(410);
				aDialog = new Dialog3Choice(this); // 충렬사역410 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 862) && (e.getX() < 872)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(411);
				aDialog = new Dialog3Choice(this); // 낙민역411 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 821) && (e.getX() < 831)) && ((e.getY() > 311) && (e.getY() < 321))) {
				metroVO.setStnnum(412);
				aDialog = new Dialog3Choice(this); // 수안역412 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			////////////////////////////////////////////////////////////////////////////////// 5호선
			if (((e.getX() > 584) && (e.getX() < 594)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(501);
				aDialog = new Dialog3Choice(this); // 가야대역501 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 516) && (e.getX() < 526)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(502);
				aDialog = new Dialog3Choice(this); // 장신대역502 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 448) && (e.getX() < 458)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(503);
				aDialog = new Dialog3Choice(this); // 연지공원역503 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 380) && (e.getX() < 390)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(504);
				aDialog = new Dialog3Choice(this); // 박물관역504 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 311) && (e.getX() < 321)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(505);
				aDialog = new Dialog3Choice(this); // 수로왕릉역505 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 241) && (e.getX() < 251)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(506);
				aDialog = new Dialog3Choice(this); // 봉황역506 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 174) && (e.getX() < 184)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(507);
				aDialog = new Dialog3Choice(this); // 부원역507 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 106) && (e.getX() < 116)) && ((e.getY() > 64) && (e.getY() < 74))) {
				metroVO.setStnnum(508);
				aDialog = new Dialog3Choice(this); // 김해시청역508 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 107) && (e.getY() < 117))) {
				metroVO.setStnnum(509);
				aDialog = new Dialog3Choice(this); // 인제역509 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 152) && (e.getY() < 195))) {
				metroVO.setStnnum(510);
				aDialog = new Dialog3Choice(this); // 김해대학역510 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 195) && (e.getY() < 205))) {
				metroVO.setStnnum(511);
				aDialog = new Dialog3Choice(this); // 지내역511 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 239) && (e.getY() < 249))) {
				metroVO.setStnnum(512);
				aDialog = new Dialog3Choice(this); // 불암역512 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 283) && (e.getY() < 293))) {
				metroVO.setStnnum(513);
				aDialog = new Dialog3Choice(this); // 대사역513 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 329) && (e.getY() < 339))) {
				metroVO.setStnnum(514);
				aDialog = new Dialog3Choice(this); // 평강역514 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 426) && (e.getY() < 436))) {
				metroVO.setStnnum(516);
				aDialog = new Dialog3Choice(this); // 등구역516 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 464) && (e.getY() < 474))) {
				metroVO.setStnnum(517);
				aDialog = new Dialog3Choice(this); // 덕두역517 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 65) && (e.getX() < 75)) && ((e.getY() > 503) && (e.getY() < 513))) {
				metroVO.setStnnum(518);
				aDialog = new Dialog3Choice(this); // 공항역518 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 146) && (e.getX() < 156)) && ((e.getY() > 547) && (e.getY() < 557))) {
				metroVO.setStnnum(519);
				aDialog = new Dialog3Choice(this); // 서부산유통지구역519 클릭마우스리스너 작동
				aDialog.setVisible(true);
				metroMapPanel.requestFocus();
			}
			if (((e.getX() > 265) && (e.getX() < 275)) && ((e.getY() > 547) && (e.getY() < 557))) {
				metroVO.setStnnum(520);
				aDialog = new Dialog3Choice(this); // 괘법르네시때역520 클릭마우스리스너 작동
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

	// 메인메소드
	public static void main(String[] args) {
		MetroMapFrame m = new MetroMapFrame();

	}

	// 다이얼로그 클래스
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	// 출발역, 도착역, 역정보 선택 다이얼로그
	class Dialog3Choice extends JDialog {
		JPanel p1, p2;
		JLabel l;
		JButton departButton = new JButton("출발역"); // 버튼에 대한 액션리스너 적용해야함.
		JButton arriveButton = new JButton("도착역");
		JButton informButton = new JButton("역정보");
		private DialogStnResult resultDialog;
		private DialogCalcResult calcDialog;

		Dialog3Choice(MyMouseListener myMouseListener) {
			super();
			p1 = new JPanel();
			p1.setLayout(new FlowLayout());
			p1.add(departButton);
			p1.add(arriveButton);
			p1.add(informButton);

			departButton.addActionListener(new ActionListener() { // 출발역 버튼
																	// 액션리스너
				@Override
				public void actionPerformed(ActionEvent e) {
					departmetroVO = metroDao.selectStationWhere(metroVO.getStnnum());
					aDialog.setVisible(false);
					System.out.println("출발역:" + departmetroVO.getStnnum());
					departStn = departmetroVO.getStnnum();

				}
			});

			arriveButton.addActionListener(new ActionListener() { // 도착역 버튼
																	// 액션리스너
				@Override
				public void actionPerformed(ActionEvent e) {
					arrivemetroVO = metroDao.selectStationWhere(metroVO.getStnnum());
					aDialog.setVisible(false);
					System.out.println("도착역:" + arrivemetroVO.getStnnum());
					arriveStn = arrivemetroVO.getStnnum();
					RouteCal r = new RouteCal(departStn, arriveStn);
					currentHour = LocalTime.now().getHour();
					currentMinute = LocalTime.now().getMinute();
					ArrivalHour = currentHour;
					ArrivalMinute = currentMinute + r.getDistance();

					calcDialog = new DialogCalcResult(this);
					calcDialog.setVisible(true);
					//////////////////////// 결과 다이얼로그 불러와야되

				}
			});
			informButton.addActionListener(new ActionListener() { // 역정보 버튼
																	// 액션리스너
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
			setTitle(metroVO.getStn() + "역");
			setLocationRelativeTo(metroMapPanel);

		}
	}

	// 역정보 결과 다이얼로그
	class DialogStnResult extends JDialog {
		StnResultPanel stnResultPanel = new StnResultPanel();

		DialogStnResult(ActionListener actionListener) {

			metroVO = metroDao.selectStationWhere(metroVO.getStnnum());
			setTitle(metroVO.getStn() + "역");
			metroVO = metroVOnull;

			add(stnResultPanel);
			aDialog.requestFocus();
			setSize(362, 208);
			setLocationRelativeTo(metroMapPanel);
		}
	}

	// 최단시간 계산 결과 다이얼로그
	class DialogCalcResult extends JDialog {
		CalcResultPanel calcResultPanel = new CalcResultPanel();
		RouteCal routecal = new RouteCal(arriveStn, departStn);

		int d = 0; ///// 예시용
		int h = 9; ///// 예시용
		int m = 58; ///// 예시용
		String depart = "출발"; ///// 예시용
		String arrive = "도착"; ///// 예시용
		String transfer1 = "환승1"; ///// 예시용
		String transfer2 = "환승2"; ///// 예시용
		String transfer3 = "환승3"; ///// 예시용
		

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
		JButton btn = new JButton("확인");
		JLabel departLabel = new JLabel(departmetroVO.getStn()); /// 출발역의 VO.Stn 이 들어와야됨
		JLabel arriveLabel = new JLabel(arrivemetroVO.getStn()); /// 도착역의 VO.Stn 이 들어와야됨
		JLabel transfer1Label = new JLabel(transfer1); /// 환승역1의 VO.Stn이 들어와야됨
		JLabel transfer1Labe2 = new JLabel(transfer2); /// 환승역2의 VO.Stn이 들어와야됨
		JLabel transfer1Labe3 = new JLabel(transfer3); /// 환승역3의 VO.Stn이 들어와야됨

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
			

						
			JLabel line1Label = new JLabel(lane1); /// 1호선 이미지 라벨
			JLabel line1Labela = new JLabel(lane1);
			JLabel line2Label = new JLabel(lane2); /// 2호선 이미지 라벨
			JLabel line2Labela = new JLabel(lane2);
			JLabel line3Label = new JLabel(lane3); /// 3호선 이미지 라벨
			JLabel line3Labela = new JLabel(lane3);
			JLabel line4Label = new JLabel(lane4); /// 4호선 이미지 라벨
			JLabel line4Labela = new JLabel(lane4);
			JLabel line5Label = new JLabel(lane5); /// 5호선 이미지 라벨
			JLabel line5Labela = new JLabel(lane5);
			JLabel arrowLabel1 = new JLabel(arrow); /// 화살표1 이미지 라벨
			JLabel arrowLabel2 = new JLabel(arrow); /// 화살표2 이미지 라벨
			JLabel arrowLabel3 = new JLabel(arrow); /// 화살표3 이미지 라벨
			JLabel ropeLabel = new JLabel(rope); /// 만약의 경우를 위한 rope
			JLabel qr = new JLabel(QR);
			JLabel text1 = new JLabel("소요시간                       ");
			JLabel text2 = new JLabel("출발시각                 ");
			JLabel text3 = new JLabel(" 도착시각                       ");
			JLabel textSpace1 = new JLabel("                  "); //여백
			JLabel textSpace2 = new JLabel("                                  "); //여백
			JLabel textSpace3 = new JLabel("                                  "); //여백
			
			
			
			JLabel realTime = new JLabel(currentHour + ":" + currentMinute);
			
////////////////소!!!!요!!!!시!!!!!간!!!!! 소요시간!!!!!!! 뭐 불러와야되!!!!///////////////////////
			JLabel duration = new JLabel(routecal.getDistance() + " 분"); 

///////////////도!!!!착!!!!시!!!!각!!!!!! 도착시각!!!!!!! 시랑 분 붙여야되!!!!!!!//////////////////
			JLabel arriveTime = new JLabel(ArrivalHour + ":" + Arrival);
			
			// 왼쪽페널과 오른쪽페널 위치, 크기, 색깔
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
			

			// 오른쪽페널 붙이기입니다.
			panelRight.add(text1); // 소요시간:
			panelRight.add(duration); // @@ 분
			duration.setFont(new Font("돋움", Font.BOLD, 40));
			panelRight.add(textSpace1);
			panelRight.add(text2); // <출발시간>
			panelRight.add(realTime);
			realTime.setFont(new Font("돋움", Font.BOLD, 40));
			panelRight.add(btn);
			btn.setBackground(Color.white);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					

					panelRight.add(text3);
					
					panelRight.add(arriveTime);
					arriveTime.setFont(new Font("돋움", Font.BOLD, 40));
					panelRight.add(qr);
				}
			});
//			panelRight.add(textSpace3);
//			panelRight.add(textSpace2);

			// 다이얼로그에 왼쪽페널, 오른쪽페널 붙이기
			add(panelLeft);
			add(panelRight);
			add(calcResultPanel);

			// 다이얼로그 기본설정
			aDialog.requestFocus();
			setSize(326, 558);
			setLocationRelativeTo(metroMapPanel);
		}

	}

	// 이 아래는 배경 이미지 그리기 패널들.(Frame, Dialog)
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 지하철 노선도 이미지 그리기 패널
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

	// 역정보 결과창 그리기 패널
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

	// 최단시간 결과창 그리기 패널
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
