package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//큰 수의 법칙
class Greedy07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Integer[] num = new Integer[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num, Comparator.reverseOrder());
		int most = num[0];
		int second = num[1];
		int my = most;
		int sum = 0;
		for (int i = 1; i <= m; i++) {

			if (i % (k+1) == 0) {
					my = second;
			} else
				my = most;
			sum += my;
			System.out.println(my);

		}
		System.out.println(sum);
	}

}
