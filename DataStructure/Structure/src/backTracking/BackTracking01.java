package backTracking;

import java.util.Scanner;
/*
 * N과M (https://www.acmicpc.net/problem/15649)
 */
public class BackTracking01 {
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		System.out.println(sb);

	}
	//중복되는 수를 제외한 모든 경우의 수를 탐색한다.
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N,M,depth+1);
				visit[i] = false;
			}
		}
	}
}
