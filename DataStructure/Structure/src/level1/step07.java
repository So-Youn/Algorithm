package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step07 {
	// ��, �� , �� , ��
	static int dirX[] = { -1, 0, 1, 0 };
	static int dirY[] = { 0, 1, 0, -1 };
	static int dirN, x, y, n, m;

	// �湮�� ��ġ �����ϱ� ���� �� ���� �� �ʱ�ȭ
	static int[][] d = new int[50][50];
	// ��ü �� ����
	static int[][] arr = new int[50][50];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		dirN = Integer.parseInt(st.nextToken());

		d[x][y] = 1; // ���� ��ǥ �湮 ó��

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 1;
		int turn_time = 0;

		while (true) {
			// �̵��� ��ǥ
			turn();
			int nowX = x + dirX[dirN];
			int nowY = y + dirY[dirN];
			if (d[nowX][nowY] == 0 && arr[nowX][nowY] == 0) { // ������ ���� ĭ�� �����ϴ� ��� �̵�
				d[nowX][nowY] = 1;
				x = nowX;
				y = nowY;
				count++;
				turn_time = 0;
				continue;
			} else // ȸ���� ���Ŀ� ���������� ĭ�� ���ų� �ٴ��� ���...
				turn_time += 1;
			// �� ���� ��� �� �� ���� ���
			if (turn_time == 4) {
				nowX = x - dirX[dirN];
				nowY = y - dirY[dirN];
				if (arr[nowX][nowY] == 0) {
					x = nowX;
					y = nowY;
				} else
					break;
				turn_time = 0;
			}
		}
		System.out.println(count);
	}

	public static void turn() {
		dirN--;
		if (dirN == -1)
			dirN = 3;
	}
}
