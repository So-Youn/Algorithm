package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step07 {
	// ºÏ, µ¿ , ³² , ¼­
	public static int dirX[] = { -1, 0, 1, 0 };
	public static int dirY[] = { 0, 1, 0, -1 };
	public static int dirN;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		dirN = Integer.parseInt(st.nextToken());
		int count = 1;
		boolean[][] visit = new boolean[n][m];
		visit[x][y] = true;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		while (true) {
			// ÀÌµ¿ÇÒ ÁÂÇ¥
			turn();
			int nowX = x + dirX[dirN];
			int nowY = y + dirY[dirN];
			if (visit[nowX][nowY] = false) {
				visit[nowX][nowY] = true;
				x = nowX;
				y = nowY;
				count++;
			} else turn();
			if(dirN ==0) {
				nowX = x - dirX[dirN];
				nowY = y + dirY[dirN];
			}
			else break;
			System.out.println(nowX +" "+nowY);
			
		}
		System.out.println(count);
	}

	public static void turn() {
		dirN--;
		if (dirN == -1) dirN = 3;
	}
}
