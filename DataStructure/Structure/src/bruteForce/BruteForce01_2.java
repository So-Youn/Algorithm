package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForce01_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_N = br.readLine();
		int len = str_N.length();
		int N = Integer.parseInt(str_N);
		int result = 0;
		// i는 가능한 최솟값인 N-9*N의 각 자릿수부터 시작
		for (int i = (N - (len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			if (sum + i == N) {
				result = i;
				break;
			}

		}
		System.out.println(result);
	}

}
