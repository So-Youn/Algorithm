package BFS;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * DFS (Depth First Search) ���� �켱 Ž��
 * ������ �ִ� �� ������ Ž���� ���� ( ��� ��� )
 * 
 * BFS (Breadth First Search) �ʺ� �켱 Ž��
 * ����� ���� ���� Ž�� �� ���� �Ѵܰ辿 Ž���� ����


 */
public class BfsDfs01 {
	static int n; // ��������
	static int m; // ��������
	static int start; // ��������
	static int[][] check; // ���� ���� ����
	static boolean[] checked; // Ȯ�� ����

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();

		check = new int[1001][1001];
		checked = new boolean[1001];
		// ���� ������� ����
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			check[x][y] = check[y][x] = 1;
		}
		sc.close();
		dfs(start);

		checked = new boolean[1001]; // Ȯ�λ��� �ʱ�ȭ
		System.out.println();
		bfs();
	}

	private static void bfs() {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(start);
		checked[start] = true;
		System.out.print(start + " ");

		// Queue�� �� ������ �ݺ�.
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
				// ���� �������� ã�� �������� �����Ͽ� ��ȣ��
				dfs(j);
			}
		}
	}
}
