package Greedy;

import java.util.Scanner;

/*
 * 평범한 배낭 (https://www.acmicpc.net/problem/12865)
 * N개의 물건이 있다. 각 물건은 무게 W와 가치 V를 가지는데, 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다. 
 * 최대 K무게까지의 배낭만 들고 다닐 수 있다. 
 * N(1 ≤ N ≤ 100)와 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)
 * 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)
 */
public class Greedy03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		int[][] dp = new int [n+1][k+1];
		int max =0;
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(w[i-1] <=j)
					dp[i][j] = Math.max(v[i-1] + dp[i-1][j-w[i-1]], dp[i-1][j] );
				else
					dp[i][j] = dp[i-1][j];
				max = Math.max(dp[i][j], max);
			}
		}
		System.out.println(max);
	}
}
