package backTracking;

import java.util.Scanner;

/*
 * N과M(https://www.acmicpc.net/problem/15651)
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 M개를 고른 수열
 * 같은 수를 여러 번 골라도 된다.
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
		// 깊이가 M이랑 같아지면 출력후 return
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
