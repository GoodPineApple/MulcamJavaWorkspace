package metro;

public class RouteCal {
	DijkstraBusan d0 = new DijkstraBusan();
	DijkstraBusan d = new DijkstraBusan();
	DijkstraBusan d1 = new DijkstraBusan();
	DijkstraBusan d2 = new DijkstraBusan();
	DijkstraBusan d3 = new DijkstraBusan();
	DijkstraBusan d4 = new DijkstraBusan();
	DijkstraBusan d5 = new DijkstraBusan();

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
	private int distance0;
	private int distance1;
	private int distance2;
	private int distance3;
	private int distance4;
	private int distance5;
	private int distanceDij;

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
	// 환승시간을 더한 시간
	private int distancePlus;
	// 같은 노선일때 걸린시간
	private int Duration = 0;
	private int Dijkstra = 0;

	private int[] path;// = new int[8];
	protected int firstpath;
	private int transferCount = 0;

	private int[] dijkStn1 = { 1, 4 };
	private int[] dijkStn2 = { 3, 5 };
	private int[] dijkStn3 = { 2, 3 };
	private int[] dijkStn4 = { 3, 4 };
	private int[] dijkStn5 = { 1, 3 };
	private int[] dijkStn6 = { 2, 3 };
	private int[] dijkStn7 = { 2, 5 };
	private int[] dijkStn8 = { 1, 2 };

	public RouteCal(int depart, int arrive) {
		metroDao.createConnection();
		departmetroVO = metroDao.selectStationWhere(depart);
		arrivemetroVO = metroDao.selectStationWhere(arrive);

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

		Duration = calcDuration();
		Dijkstra = getDijkstra();

		if (Duration == 0) {
			distance = Dijkstra;
		} else {
			distance = Math.min(Duration, Dijkstra);
		}

		System.out.println(departmetroVO.getStn() + " 에서 " + arrivemetroVO.getStn() + " 까지");
		System.out.println("총 걸린 시간:" + distance);
		System.out.println("Duration :" + Duration);
		System.out.println("Dijkstra :" + Dijkstra);
		getTransfer();
		

	}

	// 출발역, 도착역이 같은 호선일때
	public int calcDuration() {
		if (departmetroVO.getStnline() == arrivemetroVO.getStnline()) {
			if (departmetroVO.getStnnum() >= arrivemetroVO.getStnnum()) {
				for (int i = arrivemetroVO.getStnnum(); i < departmetroVO.getStnnum(); i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					distance0 += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = departmetroVO.getStnnum(); i < arrivemetroVO.getStnnum(); i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					distance0 += departmetroVO2.getDuration();
				}
			}

			// Map에서 출발역 클릭 할 때 같은 역이지만 다른 호선이 있는 경우(출발역과 도착역이 같은호선일 경우의 계산오류방지)
		} else if ((departmetroVO.getOtherStn() / 100) == arrivemetroVO.getStnline()) {
			departmetroVO = metroDao.selectStationWhere(departmetroVO.getOtherStn());
			if (departmetroVO.getStnnum() >= arrivemetroVO.getStnnum()) {
				for (int i = arrivemetroVO.getStnnum(); i < departmetroVO.getStnnum(); i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					distance0 += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = departmetroVO.getStnnum(); i < arrivemetroVO.getStnnum(); i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					distance0 += departmetroVO2.getDuration();

				}
			}
			// Map에서 도착역 클릭 할 때 같은 역이지만 다른 호선이 있는 경우(출발역과 도착역이 같은호선일 경우의 계산오류방지)
		} else if (departmetroVO.getStnline() == (arrivemetroVO.getOtherStn() / 100)) {
			arrivemetroVO = metroDao.selectStationWhere(arrivemetroVO.getOtherStn());
			if (departmetroVO.getStnnum() >= arrivemetroVO.getStnnum()) {
				for (int i = arrivemetroVO.getStnnum(); i < departmetroVO.getStnnum(); i++) {
					arrivemetroVO2 = metroDao.selectStationWhere(i);
					distance0 += arrivemetroVO2.getDuration();
				}
			} else {
				for (int i = departmetroVO.getStnnum(); i < arrivemetroVO.getStnnum(); i++) {
					departmetroVO2 = metroDao.selectStationWhere(i);
					distance0 += departmetroVO2.getDuration();
				}
			}
		}

		return distance0;
	}

	public int getDijkstra() {
		// // 출발역, 도착역이 다른 호선일때
		// if (departStnNum / 100 != arriveStnNum / 100
		// && (departmetroVO.getOtherStn() / 100) != arrivemetroVO.getStnline()
		// && departmetroVO.getStnline() != (arrivemetroVO.getOtherStn() / 100))
		// {

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

		distance1 = d1.calDistance(dijktransferdepart1, dijktransferarrive1) + departStnDuration1 + arriveStnDuration1;
		distance2 = d2.calDistance(dijktransferdepart1, dijktransferarrive2) + departStnDuration1 + arriveStnDuration2;
		distance3 = d3.calDistance(dijktransferdepart2, dijktransferarrive1) + departStnDuration2 + arriveStnDuration1;
		distance4 = d4.calDistance(dijktransferdepart2, dijktransferarrive2) + departStnDuration2 + arriveStnDuration2;
		int a = Math.min(distance1, distance2);
		int b = Math.min(distance3, distance4);
		distanceDij = Math.min(a, b);

		// }

		if (distance == distance1) {
			path = d1.getfinalPath();
			firstpath = path[d1.path_cnt - 1];
		} else if (distance == distance2) {
			path = d2.getfinalPath();
			firstpath = path[d2.path_cnt - 1];
		} else if (distance == distance3) {
			path = d3.getfinalPath();
			firstpath = path[d3.path_cnt - 1];
		} else {
			path = d4.getfinalPath();
			firstpath = path[d4.path_cnt - 1];
		}

		// System.out.println(firstpath);
		// for(int i=0;i<path.length;i++){
		// path[path.length-i] = path[i];
		// }
		for (int i = 0; i < 8; i++) {
			System.out.println("test:" + path[i]);
		}
		//
		return distanceDij;

	}

	public int getFirstTransfer() {
		return firstpath;
	}

	int transfer1 = 0;
	int transfer2 = 0;
	int transfer3 = 0;
	int transfer4 = 0;
	int transfer5 = 0;
	int transfer6 = 0;
	int transfer7 = 0;

	public int getTransfer() {
		int[] departDijkStn = new int[2];
		int[] arriveDijkStn = new int[2];
		departDijkStn[0] = departmetroVO.getStnline();
		departDijkStn[1] = departmetroVO.getOtherStn() / 100;
		arriveDijkStn[0] = arrivemetroVO.getStnline();
		arriveDijkStn[1] = arrivemetroVO.getOtherStn() / 100;

		System.out.println();
		System.out.println();
		int[][] dijkToStnNum = { { 1, 4 }, { 3, 5 }, { 2, 3 }, { 3, 4 }, { 1, 3 }, { 2, 3 }, { 2, 5 }, { 1, 2 } };

		// if (arrivemetroVO.getStnline()==dijkToStnNum[path[0]-1][0]) {
		// transfer1 = arrivemetroVO.getStnline();
		// }else{
		// transfer1 = dijkToStnNum[path[0]-1][1];
		// }
		// if(dijkToStnNum[path[1]-1][0] == dijkToStnNum[path[0]-1][0]){
		// transfer2 = dijkToStnNum[path[1]-1][0];
		// }else{
		// transfer2 = dijkToStnNum[path[1]-1][1];
		// }
		// if(dijkToStnNum[path[2]-1][0] == dijkToStnNum[path[1]-1][0]){
		// transfer3 = dijkToStnNum[path[2]-1][0];
		// }else{
		// transfer3 = dijkToStnNum[path[2]-1][1];
		// }
		// if(dijkToStnNum[path[3]-1][0] == dijkToStnNum[path[2]-1][0]){
		// transfer4 = dijkToStnNum[path[3]-1][0];
		// }else{
		// transfer4 = dijkToStnNum[path[3]-1][1];
		// }
		//// if(dijkToStnNum[path[4]-1][0] == dijkToStnNum[path[3]-1][0]){
		// transfer5 = dijkToStnNum[path[4]-1][0];
		// }else{
		// transfer5 = dijkToStnNum[path[4]-1][1];
		// }
		// if(dijkToStnNum[path[5]-1][0] == dijkToStnNum[path[4]-1][0]){
		// transfer6 = dijkToStnNum[path[5]-1][0];
		// }else{
		// transfer6 = dijkToStnNum[path[6]-1][1];
		// }
		//
		// System.out.println(transfer1);
		// System.out.println(transfer2);
		// System.out.println(transfer3);
		// System.out.println(transfer4);
		// System.out.println(transfer5);
		// System.out.println(transfer6);
		//

		// for (int i = 0; i < 7; i++) {
		// for (int j = 0; j < 2; j++) {
		// for (int k = 0; k < 2; k++) {
		// // if (dijkToStnNum[path[i]][j] == dijkToStnNum[path[i +
		// // 1]][k]) {
		// if (path[i] != 0) {
		// if (dijkToStnNum[path[i]][j] == dijkToStnNum[path[i + 1]][k]) {
		// transferCount++;
		// }
		// }
		// System.out.println(transferCount);
		// }
		// }
		// }
		return 0;
	}
	
	public int getDuration() {
		return Duration;
	}
	public int getDistance() {
		return distance;
	}
	

	public static void main(String[] args) {
		RouteCal d = new RouteCal(101, 125);
		System.out.println(d.getDistance());
	}
}