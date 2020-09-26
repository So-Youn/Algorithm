package bruteForce;

import java.util.Scanner;

public class BruteForce01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = check(0, N);
		System.out.println(result);
		sc.close();
	}

	static int check(int result, int N) {

		for (int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;
			while (number != 0) {
				sum += number % 10;// 각 자릿수 더하기
				number /= 10;
			}
			if (sum + i == N) {
				result = i;
				break;
			}
		}
		return result;
	}

}
