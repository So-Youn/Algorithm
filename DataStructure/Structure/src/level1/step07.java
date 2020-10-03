package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step07 {
	// 북, 동 , 남 , 서
	static int dirX[] = { -1, 0, 1, 0 };
	static int dirY[] = { 0, 1, 0, -1 };
	static int dirN, x, y, n, m;

	// 방문한 위치 저장하기 위한 맵 생성 및 초기화
	static int[][] d = new int[50][50];
	// 전체 맵 정보
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

		d[x][y] = 1; // 현재 좌표 방문 처리

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 1;
		int turn_time = 0;

		while (true) {
			// 이동할 좌표
			turn();
			int nowX = x + dirX[dirN];
			int nowY = y + dirY[dirN];
			if (d[nowX][nowY] == 0 && arr[nowX][nowY] == 0) { // 가보지 않은 칸이 존재하는 경우 이동
				d[nowX][nowY] = 1;
				x = nowX;
				y = nowY;
				count++;
				turn_time = 0;
				continue;
			} else // 회전한 이후에 가보지않은 칸이 없거나 바다인 경우...
				turn_time += 1;
			// 네 방향 모두 갈 수 없는 경우
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
