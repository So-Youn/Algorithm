package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 미로 찾기
 */
public class Book02 {
	static int N, M;
	static int[][] arr;
	static int[][] visited;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][M + 1];
		visited = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			for (int j = 1; j <= M; j++) {
				arr[i][j] = str.charAt(j - 1) - '0';
			}
		}
		bfs();
	}

	public static void bfs() {
		Queue<Point> que = new LinkedList<Point>();
		que.add(new Point(1, 1)); // 동빈 시작 위치
		visited[1][1] = 1;

		while (!que.isEmpty()) {
			Point p = que.poll();
			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (check(nx, ny)) {
					que.add(new Point(nx, ny));
					visited[nx][ny] = visited[p.x][p.y] + 1;
				}
			}

		}
		System.out.println(visited[N][M]);
	}

	public static boolean check(int x, int y) {
		if (x < 1 | x > N | y < 1 | y > M) 
			return false;
		if (arr[x][y] == 0 || visited[x][y] != 0)
			return false;
		return true;
	}

}
