package BFS;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * DFS (Depth First Search) 깊이 우선 탐색
 * 인접해 있는 점 순으로 탐색해 나감 ( 재귀 사용 )
 * 
 * BFS (Breadth First Search) 너비 우선 탐색
 * 가까운 정점 먼저 탐색 후 점차 한단계씩 탐색해 나감


 */
public class BfsDfs01 {
	static int n; // 정점개수
	static int m; // 간선개수
	static int start; // 시작정점
	static int[][] check; // 간선 연결 상태
	static boolean[] checked; // 확인 여부

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();

		check = new int[1001][1001];
		checked = new boolean[1001];
		// 간선 연결상태 저장
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			check[x][y] = check[y][x] = 1;
		}
		sc.close();
		dfs(start);

		checked = new boolean[1001]; // 확인상태 초기화
		System.out.println();
		bfs();
	}

	private static void bfs() {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(start);
		checked[start] = true;
		System.out.print(start + " ");

		// Queue가 빌 때까지 반복.
		while (!que.isEmpty()) {
			int temp = que.poll();

			for (int j = 1; j <= n; j++) {
				if (check[temp][j] == 1 && checked[j] == false) {
					que.offer(j);
					checked[j] = true;
					System.out.print(j + " ");
				}
			}
		}

	}

	private static void dfs(int i) {
		checked[i] = true;
		System.out.print(i + " ");
		for (int j = 1; j <= n; j++) {
			if (check[i][j] == 1 && checked[j] == false) {
				// 다음 연결점을 찾아 시작점을 변경하여 재호출
				dfs(j);
			}
		}
	}
}
