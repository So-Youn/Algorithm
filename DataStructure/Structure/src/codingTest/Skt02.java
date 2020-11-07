package codingTest;

public class Skt02 {
	public static void main(String[] args) {
		//int N = 4, K = 10;
		int N = 4, K = 10;
		int result = solution(N, K);
		System.out.println(result);
	}

	public static int solution(int N, int K) {
		int answer = 1000000;
		int count = 0;
		if (N == 1)
			return -1;
		else {
			while (K != 0) {
				if (K / N > 0) {
					count += K / N;
					K = K % N;
				}
				if (K /N == 0)
					count++;
					K =0;
			}
			return count;
		}
	}
}
