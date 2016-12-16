package metro;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class DijkstraBusan {
	final int n = 8; // �迭�� ũ��
	final int f = 10000; // �̵��� �� ���� �� or �𸣴°�
	int i, j, k, l = 0; // ����ȣ ���� ����
	int min; // ���� ����� ��
	int[] visit = new int[n]; // �湮�ߴ�������? �湮���� = 0, �湮�� = 1;
	int[] distance = new int[n]; // ���� �Ÿ�
	int[] via = new int[n]; // ������
	int path[] = new int[n]; // ��� ���� ���� ����
	int path2[] = new int[n];
	int path_cnt = 0; // ��� ī��Ʈ
	int finalPath[] = new int[n];

	public int calDistance(int startSub, int endSub) { // �ִܰŸ� ���ϴ� �޼ҵ�

		int[][] data = { { 0, f, f, 2, 3, f, f, f }, { f, 0, 8, f, f, f, 14, f }, { f, 8, 0, 9, f, f, 11, f },
				{ 2, f, 9, 0, 6, f, f, f }, { 3, f, f, 6, 0, 8, f, 7 }, { f, f, f, f, 8, 0, f, 19 },
				{ f, 14, 11, f, f, f, 0, 14 }, { f, f, f, f, 7, 19, 14, 0 } };

		for (j = 0; j < n; j++) {
			visit[j] = 0; // 0~7 ���� �湮���θ� 0(�湮����)���� �ʱ�ȭ
			distance[j] = f; // distance[0] ~ distance[7] = f ���� �ʱ�ȭ
		}

		distance[startSub - 1] = 0; // ��߿� -1�� �ؼ� 0~7������ �����ְ� ��߿��� 0���� �ʱ�ȭ

		for (i = 0; i < n; i++) {
			min = f; // �ִܰŸ��� 10000���� �ʱ�ȭ
			for (j = 0; j < n; j++) {
				// �湮������ ���� ���� ����� ���� ����(k�� ���� ����� ����ȣ�� ���� ��)
				if (visit[j] == 0 && distance[j] < min) {
					k = j;
					min = distance[j];
				}
			}

			visit[k] = 1; // k�� �湮�ߴٰ� üũ

			for (j = 0; j < n; j++) {
				// ���ݱ��� �˷��� �ִܰŸ����� �� ª�� �Ÿ��� ���ð�� �� ������ �ִܰŸ��� ����
				if (distance[j] > distance[k] + data[k][j]) {
					distance[j] = distance[k] + data[k][j];

					via[j] = k; // k���� j��° �������� ����
				}
			}

		}

		// System.out.printf("%d���� ����Ͽ�, %d�� ���� �ִ� �Ÿ��� %d�Դϴ�.\n", startSub,
		// endSub, distance[endSub - 1]);
		k = endSub - 1; // k = ������
		while (true) {
			path[path_cnt++] = k; // ���[���ī��Ʈ] = ��
			if (k == startSub - 1) // k �� ��߿��� �Ǹ� ����
				break;
			k = via[k]; // k�� �������� �ƴҰ�� k = via[k]
		}

		for (int i = path_cnt; i >= 0; i--) {
			path2[i] = k; // ���[���ī��Ʈ] = ��
			if (k == startSub - 1) // k �� ��߿��� �Ǹ� ����
				break;
			k = via[k]; // k�� �������� �ƴҰ�� k = via[k]
		}

		// System.out.print("��δ� : ");
		//
		// for (i = path_cnt - 1; i >= 1; i--) { // ��θ� ���󰡸鼭 ǥ������
		// System.out.printf("%d -> ", path[i] + 1);
		// }
		// System.out.printf("%d �Դϴ�.\n", path[i] + 1);
		//
		// System.out.println();
		// for (l = 0; l < n; l++) {
		// System.out.println(startSub + "���� " + (l + 1) + "������ �ִܰŸ��� " +
		// distance[l] + " �Դϴ�.");
		// }
		// System.out.println(distance[endSub - 1]);
		// System.out.println("ȯ��:"+(path_cnt-1));
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
		System.out.println("ȯ��: " + (path_cnt) + "��");
		return finalPath;

	}

	public int getPathCount() {

		return path_cnt;
	}

	// public static void main(String[] args) {
	// DijkstraBusan d = new DijkstraBusan();
	// Scanner input = new Scanner(System.in);
	//
	// System.out.print("��߿��� �Է��Ͻÿ� : ");
	// int start = input.nextInt();
	// System.out.print("�������� �Է��Ͻÿ� : ");
	// int end = input.nextInt();
	//
	// d.calDistance(start, end);
	// input.close(); // ��ĳ�� �ݱ�
	// }
}