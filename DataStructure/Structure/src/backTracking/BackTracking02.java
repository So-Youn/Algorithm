package backTracking;

import java.util.Scanner;

/*
 * N과M(https://www.acmicpc.net/problem/15649)
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * 고른 수열은 오름차순이어야 한다.
 */
public class BackTracking02 {
	public static int[] arr;
	public static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		arr = new int[M];
		dfs(1, 0);
	}

	public static void dfs(int at, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		for(int i=at;i<=N;i++) {
			arr[depth] = i;
			dfs(i+1,depth+1);
		}
	}

}
