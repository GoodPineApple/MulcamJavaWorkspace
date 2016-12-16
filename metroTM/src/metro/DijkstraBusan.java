package metro;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class DijkstraBusan {
	final int n = 8; // 배열의 크기
	final int f = 10000; // 이동할 수 없는 곳 or 모르는곳
	int i, j, k, l = 0; // 역번호 저장 변수
	int min; // 가장 가까운 역
	int[] visit = new int[n]; // 방문했던곳인지? 방문안함 = 0, 방문함 = 1;
	int[] distance = new int[n]; // 누적 거리
	int[] via = new int[n]; // 경유지
	int path[] = new int[n]; // 경로 저장 변수 선언
	int path2[] = new int[n];
	int path_cnt = 0; // 경로 카운트
	int finalPath[] = new int[n];

	public int calDistance(int startSub, int endSub) { // 최단거리 구하는 메소드

		int[][] data = { { 0, f, f, 2, 3, f, f, f }, { f, 0, 8, f, f, f, 14, f }, { f, 8, 0, 9, f, f, 11, f },
				{ 2, f, 9, 0, 6, f, f, f }, { 3, f, f, 6, 0, 8, f, 7 }, { f, f, f, f, 8, 0, f, 19 },
				{ f, 14, 11, f, f, f, 0, 14 }, { f, f, f, f, 7, 19, 14, 0 } };

		for (j = 0; j < n; j++) {
			visit[j] = 0; // 0~7 역의 방문여부를 0(방문안함)으로 초기화
			distance[j] = f; // distance[0] ~ distance[7] = f 으로 초기화
		}

		distance[startSub - 1] = 0; // 출발역 -1을 해서 0~7까지로 맞춰주고 출발역을 0으로 초기화

		for (i = 0; i < n; i++) {
			min = f; // 최단거리를 10000으로 초기화
			for (j = 0; j < n; j++) {
				// 방문한적이 없고 가장 가까운 역을 구함(k에 가장 가까운 역번호가 들어가게 됨)
				if (visit[j] == 0 && distance[j] < min) {
					k = j;
					min = distance[j];
				}
			}

			visit[k] = 1; // k는 방문했다고 체크

			for (j = 0; j < n; j++) {
				// 지금까지 알려진 최단거리보다 더 짧은 거리가 나올경우 그 값으로 최단거리를 갱신
				if (distance[j] > distance[k] + data[k][j]) {
					distance[j] = distance[k] + data[k][j];

					via[j] = k; // k역을 j번째 경유지로 저장
				}
			}

		}

		// System.out.printf("%d에서 출발하여, %d로 가는 최단 거리는 %d입니다.\n", startSub,
		// endSub, distance[endSub - 1]);
		k = endSub - 1; // k = 종착역
		while (true) {
			path[path_cnt++] = k; // 경로[경로카운트] = 역
			if (k == startSub - 1) // k 가 출발역이 되면 종료
				break;
			k = via[k]; // k가 종착역이 아닐경우 k = via[k]
		}

		for (int i = path_cnt; i >= 0; i--) {
			path2[i] = k; // 경로[경로카운트] = 역
			if (k == startSub - 1) // k 가 출발역이 되면 종료
				break;
			k = via[k]; // k가 종착역이 아닐경우 k = via[k]
		}

		// System.out.print("경로는 : ");
		//
		// for (i = path_cnt - 1; i >= 1; i--) { // 경로를 따라가면서 표시해줌
		// System.out.printf("%d -> ", path[i] + 1);
		// }
		// System.out.printf("%d 입니다.\n", path[i] + 1);
		//
		// System.out.println();
		// for (l = 0; l < n; l++) {
		// System.out.println(startSub + "에서 " + (l + 1) + "까지의 최단거리는 " +
		// distance[l] + " 입니다.");
		// }
		// System.out.println(distance[endSub - 1]);
		// System.out.println("환승:"+(path_cnt-1));
		return distance[endSub - 1];

	}

	public int[] getfinalPath() {

		for (i = path_cnt - 1; i >= 0; i--) {
			finalPath[i] = path[i] + 1;
			System.out.print(finalPath[i] + " ");
		}
		if (path_cnt < 0) {
			path_cnt = 0;
		}
		System.out.println("환승: " + (path_cnt) + "번");
		return finalPath;

	}

	public int getPathCount() {

		return path_cnt;
	}

	// public static void main(String[] args) {
	// DijkstraBusan d = new DijkstraBusan();
	// Scanner input = new Scanner(System.in);
	//
	// System.out.print("출발역을 입력하시오 : ");
	// int start = input.nextInt();
	// System.out.print("도착역을 입력하시오 : ");
	// int end = input.nextInt();
	//
	// d.calDistance(start, end);
	// input.close(); // 스캐너 닫기
	// }
}