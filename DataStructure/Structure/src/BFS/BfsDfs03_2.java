package BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BfsDfs03_2 {
	static int N, count;
	static int[][] arr;
	static int[][] visited;
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };

	static ArrayList<Integer> al = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		arr = new int[N][N];
		visited = new int[N][N];

		for (int i = 0; i < N; i++) {
			String input = sc.next();
			for (int j = 0; j < N; j++)
				arr[i][j] = input.charAt(j) - '0';
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				if (arr[i][j] == 1 && visited[i][j] == 0) {
					count = 1;
					dfs(i, j);
					al.add(count);
				}
		}
		Collections.sort(al);
		System.out.println(al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	static int dfs(int x, int y) {
		visited[x][y] = 1;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (arr[nx][ny] == 1 && visited[nx][ny] == 0) {
					dfs(nx, ny);
					count++;
				}
			}
		}
		return count;
	}

}
