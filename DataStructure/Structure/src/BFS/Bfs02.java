package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import BFS.Bfs01.Dot;

/*
 * �̷� Ž��(https://www.acmicpc.net/problem/2178)
 * Bfs ���� 
 * 1. �ּ� ��� ���� (������ ĭ���� �̵�)
 * 2. ���� ����ġ�� 1�� ���
 * 3. ������ ������ ������ ����.
 */
public class Bfs02 {
	static int N, M; // ���μ��� ĭ ��
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int[][] arr;
	static int[][] checked;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][M + 1];
		checked = new int[N][M];
		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			for (int j = 1; j <= M; j++) {
				arr[i][j] = str.charAt(j - 1) - '0';
			}
		}
		bfs();
	}

	public static void bfs() {
		Queue<Dot> que = new LinkedList<Dot>();
		// ������ �߰�
		que.add(new Dot(1, 1));

		checked[1][1] = 1;

		while (!que.isEmpty()) {
			Dot d = que.poll();
			for (int i = 0; i < 4; i++) {
				int x = d.x + dx[i];
				int y = d.y + dy[i];
				if (checkLocation(x, y)) {
					// ���� ��� �߰�
					que.add(new Dot(x, y));
					// �߰��� �������� �Ÿ� = ���� �������� �Ÿ� + 1
					checked[x][y] = checked[d.x][d.y] + 1;
				}
			}
		}
		System.out.println(checked[N][M]);
	}

	private static boolean checkLocation(int x, int y) {
		if (arr[x][y] == 0 && checked[x][y] != 0)
			return false;
		if (x < 1 || x > N || y < 1 || y > M)
			return false;
		return true;

	}

}
