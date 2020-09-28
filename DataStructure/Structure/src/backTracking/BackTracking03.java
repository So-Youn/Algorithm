package backTracking;

import java.util.Scanner;

/*
 * N��M(https://www.acmicpc.net/problem/15651)
 * �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1���� N���� �ڿ��� �߿��� M���� �� ����
 * ���� ���� ���� �� ��� �ȴ�.
 */
public class BackTracking03 {
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		arr = new int[M];

		dfs(0);
		System.out.print(sb);
	}

	private static void dfs(int depth) {
		// ���̰� M�̶� �������� ����� return
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}

}
