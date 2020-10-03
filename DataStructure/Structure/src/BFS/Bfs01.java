package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 토마토(https://www.acmicpc.net/problem/7576)
 */
public class Bfs01 {
	static int N, M; // 가로세로 칸 수
	static int[][] arr;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bfs();
	}

	public static void bfs() {
		Queue<Dot> que = new LinkedList<Dot>();
		int day = 0;
		// 토마토가 있는 좌표 찾기
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1)
					que.offer(new Dot(i, j, 0));
			}
		}
		while (!que.isEmpty()) {
			Dot dot = que.poll();
			day = dot.day;

			for (int i = 0; i < 4; i++) {
				// 상하좌우
				int nx = dot.x + dx[i];
				int ny = dot.y + dy[i];

				if (0 <= nx && nx < M && 0 <= ny && ny < N) {
					if (arr[nx][ny] == 0) {
						arr[nx][ny] = 1;
						que.add(new Dot(nx, ny, day + 1));
					}
				}
			}
		}
		// 익었는지 확인
		if (checkTomato()) {
			// 모두 익을 때까지의 최소 날짜 출력
			System.out.println(day);
		} else {
			System.out.println(-1);
		}

	}

	public static boolean checkTomato() {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0)
					return false;
			}
		}
		return true;
	}
	static class Dot {
		int x;
		int y;
		int day;

		public Dot(int x, int y, int day) {
			super();
			this.x = x;
			this.y = y;
			this.day = day;
		}
		public Dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}

