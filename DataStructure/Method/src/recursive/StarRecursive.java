package recursive;

import java.util.Scanner;

public class StarRecursive {
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		arr = new char[N][N];
		
		star(0, 0, N, false);
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				sb.append( arr[i][j] );
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}

	private static void star(int x, int y, int N, boolean blank) {
		/*
		 * ����ĭ�� ��� - block���� ��� �κ��� ����
		 *  N=3�� �� ,
		 *  2���� �迭�� ����Ǿ��ٴ� �����Ͽ�(arr[][])
		 *  �ε����� 0�����̹Ƿ� N=3�� ���� ������ arr[1][1]
		 *  (0, 0), (0, 1), (0, 2), (1, 0) ������ ���� ����ϰ� 
		 *  �� ����� 4 �� �̷������ �״��� ���� �ݵ�� ����
		 *  N = 9�϶� , N=3�� ���� ����� �� ���� �Ǿ� �Ȱ��� ��Ǯ��
		 */
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		// ���̻� �ɰ� �� ���� ����� ��
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}

		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // ���� ĭ�� ���
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}

}
