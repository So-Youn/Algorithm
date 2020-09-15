package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����� ����
 * 1. ���� ��� �湮ó��
 * 2. ���� ��忡�� �����¿� ���� �� �� �ִ� �� Ȯ�� [ �ʰ����� , ������ ���� ���� Ȯ�� ]
 *  -> �� �� �ִٸ� dfs() ȣ��
 */
public class bfs {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int testCase;
	static boolean[][] arr;
	static boolean[][] checked;
	static int width, height, count, num;
	static StringTokenizer st;
	static StringBuffer sb;

	public static void main(String[] args) throws IOException {
		testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			count = 0;
			arr = new boolean[width][height];
			checked = new boolean[width][height];
			
			for (int j = 0; j < num; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x][y] = true;
			}

			for (int j = 0; j < width; j++) {
				for (int k = 0; k < height; k++) {
					// ��� Ȯ��
					if (checkLocation(j, k)) {
						count++;
						dfs(j, k);
					}
				}

			}

			sb.append(count+"\n");
		}
		System.out.println(sb);
	}

	private static void dfs(int x, int y) {
		checked[x][y] = true;
		// �����¿� true �� ����
		if (checkLocation(x - 1, y))
			dfs(x - 1, y);
		if (checkLocation(x + 1, y))
			dfs(x + 1, y);
		if (checkLocation(x, y + 1))
			dfs(x, y + 1);
		if (checkLocation(x, y - 1))
			dfs(x, y - 1);
	}

	private static boolean checkLocation(int row, int col) {
		// ��ǥ ���� �߸��� ���
		if (row < 0 || row >= width || col < 0 || col >= height)
			return false;
		// �̹� �������ų� ���߰� ���� ���
		if (checked[row][col] == true || arr[row][col] == false)
			return false;
		return true;
	}

}
