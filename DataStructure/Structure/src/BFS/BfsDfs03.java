package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//단지 번호  붙이기
public class BfsDfs03 {
	static int N;
	static StringTokenizer st;
	static int[][] arr;
	static boolean[][] checked;
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N + 1][N + 1];
		checked = new boolean[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			String input = br.readLine();
			for (int j = 1; j <= N; j++) {
				arr[i][j] = input.charAt(j - 1) - '0';
			}
		}
		dfs(1, 1);
	}

	private static void dfs(int i, int j) {
		checked[i][j] = true;
		for (i = 1; i <= i; i++) {
			for (j = 1; j <= N; j++) {
				if (arr[i][j] == 1 && checked[i][j] == false) {
					// 다음 연결점을 찾아 시작점을 변경하여 재호출
					dfs(i, j);
				}
			}
			System.out.println(count);
		}

	}

}
