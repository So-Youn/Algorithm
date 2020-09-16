package Greedy;

import java.util.Scanner;

/*
 * ����� �賶 (https://www.acmicpc.net/problem/12865)
 * N���� ������ �ִ�. �� ������ ���� W�� ��ġ V�� �����µ�, �ش� ������ �賶�� �־ ���� �ؼ��� V��ŭ ��� �� �ִ�. 
 * �ִ� K���Ա����� �賶�� ��� �ٴ� �� �ִ�. 
 * N(1 �� N �� 100)�� �ؼ��� ��ƿ �� �ִ� ���� K(1 �� K �� 100,000)
 * �� ������ ���� W(1 �� W �� 100,000)�� �ش� ������ ��ġ V(0 �� V �� 1,000)
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
