package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 바이러스(https://www.acmicpc.net/problem/2606)
 */
public class BfsDfs02 {
	static StringTokenizer st;
	static int[][] check; // 간선 연결 상태
	static boolean[] checked; // 확인 여부
	static int N;
	static int count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		check = new int[101][101];
		checked = new boolean[101];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			check[x][y] = check[y][x] = 1;
		}
		System.out.println(dfs(1));
	}

	private static int dfs(int i) {
		checked[i] = true;
		for (int j = 1; j <= N; j++) {
			if (check[i][j] == 1 && checked[j] == false) {
				// 다음 연결점을 찾아 시작점을 변경하여 재호출
				count++;
				dfs(j);
			}
		}
		return count;
	}

}
