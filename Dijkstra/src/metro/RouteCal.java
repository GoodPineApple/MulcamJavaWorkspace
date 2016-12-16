package metro;

public class RouteCal {
	DijkstraBusan d = new DijkstraBusan();
	DijkstraBusan d1 = new DijkstraBusan();
	DijkstraBusan d2 = new DijkstraBusan();
	DijkstraBusan d3 = new DijkstraBusan();
	DijkstraBusan d4 = new DijkstraBusan();

	MetroVO departmetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 출발역
	MetroVO departmetroVO2 = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 변수
	MetroVO arrivemetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 도착역
	MetroVO arrivemetroVO2 = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 변수

	MetroDao metroDao = new MetroDao();
	MetroDao metroDao2 = new MetroDao();
	MetroDao metroDao3 = new MetroDao();
	MetroDao metroDao4 = new MetroDao();
	// 출발역, 도착역에서 가까운 환승역의 다익스트라넘버1,2
	private int dijktransferdepart1;
	private int dijktransferdepart2;
	private int dijktransferarrive1;
	private int dijktransferarrive2;

	// 거리계산 저장변수1,2,3,4
	private int distance1;
	private int distance2;
	private int distance3;
	private int distance4;

	// 출발역,도착역 StnNum
	private int departStnNum;
	private int arriveStnNum;

	// 출발역,도착역에서 가까운 환승역 StnNum
	private int departCloseStn1;
	private int departCloseStn2;
	private int arriveCloseStn1;
	private int arriveCloseStn2;

	// 출발역,도착역에서 가까운 환승역1,2 까지의 거리
	private int departStnDuration1 = 0;
	private int departStnDuration2 = 0;
	private int arriveStnDuration1 = 0;
	private int arriveStnDuration2 = 0;

	// 총 걸린 시간
	private int distance;
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	// 환승시간을 더한 시간
	private int distancePlus;
	
	private int[] path = new int[6];

	public RouteCal(int stnnumfrom, int stnnumto) {
		metroDao.createConnection();
		departmetroVO = metroDao.selectStationWhere(stnnumfrom);
		arrivemetroVO = metroDao.selectStationWhere(stnnumto);

		departStnNum = departmetroVO.getStnnum();
		arriveStnNum = arrivemetroVO.getStnnum();

		departCloseStn1 = departmetroVO.getClosetransferstn1();
		departCloseStn2 = departmetroVO.getClosetransferstn2();
		arriveCloseStn1 = arrivemetroVO.getClosetransferstn1();
		arriveCloseStn2 = arrivemetroVO.getClosetransferstn2();

		dijktransferdepart1 = metroDao.selectStationWhere(departCloseStn1).getDijknum();
		dijktransferdepart2 = metroDao.selectStationWhere(departCloseStn2).getDijknum();
		dijktransferarrive1 = metroDao.selectStationWhere(arriveCloseStn1).getDijknum();
		dijktransferarrive2 = metroDao.selectStationWhere(arriveCloseStn2).getDijknum();

		// 출발역, 도착역이 같은 호선일때
		if (departmetroVO.getStnline() == arrivemetroVO.getStnline()) {
			if (departmetroVO.getStnnum() >= arrivemetroVO.getStnnum()) {
				for (int i = arrivemetroVO.getStnnum(); i < departmetroVO.getStnnum(); i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					distance += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = departmetroVO.getStnnum(); i < arrivemetroVO.getStnnum(); i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					distance += departmetroVO2.getDuration();
				}
			}
			// Map에서 출발역 클릭 할 때 같은 역이지만 다른 호선이 있는 경우(출발역과 도착역이 같은호선일 경우의 계산오류 방지)
		} else if ((departmetroVO.getOtherStn() / 100) == arrivemetroVO.getStnline()) {
			departmetroVO = metroDao.selectStationWhere(departmetroVO.getOtherStn());
			if (departmetroVO.getStnnum() >= arrivemetroVO.getStnnum()) {
				for (int i = arrivemetroVO.getStnnum(); i < departmetroVO.getStnnum(); i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					distance += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = departmetroVO.getStnnum(); i < arrivemetroVO.getStnnum(); i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					distance += departmetroVO2.getDuration();
					
				}
			}
			// Map에서 도착역 클릭 할 때 같은 역이지만 다른 호선이 있는 경우(출발역과 도착역이 같은호선일 경우의 계산오류 방지)
		} else if (departmetroVO.getStnline() == (arrivemetroVO.getOtherStn() / 100)) {
			arrivemetroVO = metroDao.selectStationWhere(arrivemetroVO.getOtherStn());
			if (departmetroVO.getStnnum() >= arrivemetroVO.getStnnum()) {
				for (int i = arrivemetroVO.getStnnum(); i < departmetroVO.getStnnum(); i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					distance += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = departmetroVO.getStnnum(); i < arrivemetroVO.getStnnum(); i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					distance += departmetroVO2.getDuration();
				}
			}

			// 출발역, 도착역이 다른 호선일때
		} else {

			// 출발역과 가까운 환승역1 까지의 거리
			if (departStnNum > departCloseStn1) {
				for (int i = departCloseStn1; i < departStnNum; i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					departStnDuration1 += departmetroVO2.getDuration();
				}
			} else {
				for (int i = departStnNum; i < departCloseStn1; i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					departStnDuration1 += departmetroVO2.getDuration();
				}
			}
			// 출발역과 가까운 환승역2 까지의 거리
			if (departStnNum >= departCloseStn2) {
				for (int i = departCloseStn2; i < departStnNum; i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					departStnDuration2 += departmetroVO2.getDuration();
				}
			} else {
				for (int i = departStnNum; i < departCloseStn1; i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					departStnDuration2 += departmetroVO2.getDuration();
				}
			}
			// 도착역과 가까운 환승역1 까지의 거리
			if (arriveStnNum >= arriveCloseStn1) {
				for (int i = arriveCloseStn1; i < arriveStnNum; i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					arriveStnDuration1 += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = arriveStnNum; i < arriveCloseStn1; i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					arriveStnDuration1 += arrivemetroVO2.getDuration();
				}
			}
			// 도착역과 가까운 환승역2 까지의 거리
			if (arriveStnNum >= arriveCloseStn2) {
				for (int i = arriveCloseStn2; i < arriveStnNum; i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					arriveStnDuration2 += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = arriveStnNum; i < arriveCloseStn1; i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					arriveStnDuration2 += arrivemetroVO2.getDuration();
				}
			}
			distance1 = d1.calDistance(dijktransferdepart1, dijktransferarrive1) + departStnDuration1
					+ arriveStnDuration1;
			distance2 = d2.calDistance(dijktransferdepart1, dijktransferarrive2) + departStnDuration1
					+ arriveStnDuration2;
			distance3 = d3.calDistance(dijktransferdepart2, dijktransferarrive1) + departStnDuration2
					+ arriveStnDuration1;
			distance4 = d4.calDistance(dijktransferdepart2, dijktransferarrive2) + departStnDuration2
					+ arriveStnDuration2;
			int a = Math.min(distance1, distance2);
			int b = Math.min(distance3, distance4);
			distance = Math.min(a, b);
		
			
		}
		System.out.println(departmetroVO.getStn() + " 에서 " + arrivemetroVO.getStn() + " 까지");
		System.out.println("총 걸린 시간:" + distance);
		
		if(distance == distance1){
			path = d1.getfinalPath();
		}else if(distance == distance2){
			path = d2.getfinalPath();
		}else if(distance == distance3){
			path = d3.getfinalPath();
		}else{
			path = d4.getfinalPath();
		}
	}
}