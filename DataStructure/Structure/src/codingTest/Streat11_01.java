package codingTest;


public class Streat11_01 {
	public static void main(String[] args) {
		int[] A = new int[] {6,2,3,5,6,3};
		int result = solution(A);
		System.out.println(result);

	}

	public static int solution(int[] A) {
		int N = A.length;
		int answer = 0;
		int total = N * (N + 1) / 2;
		int sum = 0;
		for (int i = 1; i < A.length; i++) {
			sum += A[i];
		}
		answer = Math.abs(total - sum);
		return answer;
	}
}
