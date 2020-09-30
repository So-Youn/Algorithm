package BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


//단지 번호  붙이기(https://www.acmicpc.net/problem/2667)

public class BfsDfs03 {
	static int N;
	static StringTokenizer st;
	static int[][] arr;

	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = input.charAt(j) - '0';
			}
		}
		// 오름차순으로 출력하기 위해 PriorityQueue에 저장함
		int total = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1) {
					count = 0;
					total++;
					dfs(i, j);
					pq.add(count);
				}
			}
		}
		bw.write(total + "\n");

		while (!pq.isEmpty())
			bw.write(pq.poll() + "\n");
		bw.flush();

	}

	private static void dfs(int x, int y) {
		arr[x][y] = 0;
		count++;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (arr[nx][ny] == 1)
					dfs(nx, ny);
			}
		}

	}

}
