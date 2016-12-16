package metro;

import java.util.Scanner;

public class DikstraBusan {
	final int n = 8; // �迭�� ũ��
	final int f = 10000; // �̵��� �� ���� �� or �𸣴°�
	int i, j, k = 0; // ����ȣ ���� ����
	int min; // ���� ����� ��
	int[] visit = new int[n]; // �湮�ߴ�������? �湮���� = 0, �湮�� = 1;
	int[] distance = new int[n]; // ���� �Ÿ�
	int[] via = new int[n]; // ������

	public void calDistance(int startSub, int endSub) { // �ִܰŸ� ���ϴ� �޼ҵ�

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
				// �湮������ ���� ���� ����� ���� ����
				if (visit[j] == 0 && distance[j] < min) {
					k = j;
					min = distance[j];
				}
			}

			visit[k] = 1; // k�� �湮�ߴٰ� üũ
			//
			// if (min == f)
			// break;
			for (j = 0; j < n; j++) {
				// ���ݱ��� �˷��� �ִܰŸ����� �� ª�� �Ÿ��� ���ð�� �� ������ �ִܰŸ��� ����
				if (distance[j] > distance[k] + data[k][j]) {
					distance[j] = distance[k] + data[k][j];

					via[j] = k; // k���� j��° �������� ����
				}
			}
		}

		System.out.printf("%d���� ����Ͽ�, %d�� ���� �ִ� �Ÿ��� %d�Դϴ�.\n", startSub, endSub, distance[endSub - 1]);
		int path[] = new int[n]; // ��� ���� ���� ����
		int path_cnt = 0; // ��� ī��Ʈ
		k = endSub - 1; // k = ������
		while (true) {
			path[path_cnt++] = k; // ���[���ī��Ʈ] = ��
			if (k == startSub - 1) // k �� ��߿��� �Ǹ� ����
				break;
			k = via[k]; // k�� �������� �ƴҰ�� k = via[k]
		}

		System.out.print("��δ� : ");

		for (i = path_cnt - 1; i >= 1; i--) { // ��θ� ���󰡸鼭 ǥ������
			System.out.printf("%d -> ", path[i] + 1);
		}

		System.out.printf("%d �Դϴ�.\n", path[i] + 1);
		// System.out.println("ȯ��??:" + (path_cnt - 2) + "��");

		System.out.println();
		for (int l = 0; i < n; i++) {
			System.out.println(startSub + "���� " + (i + 1) + "������ �ִܰŸ���  " + distance[i] + " �Դϴ�.");
		}
	}

	public void compareCloseDistance() { // ����� ȯ�¿� ���ϴ� �޼ҵ�

	}

	public static void main(String[] args) {
		DikstraBusan d = new DikstraBusan();
		Scanner input = new Scanner(System.in);

		System.out.print("��߿��� �Է��Ͻÿ� : ");
		int start = input.nextInt();
		System.out.print("�������� �Է��Ͻÿ� : ");
		int end = input.nextInt();

		d.calDistance(start, end);
		input.close(); // ��ĳ�� �ݱ�
	}
}