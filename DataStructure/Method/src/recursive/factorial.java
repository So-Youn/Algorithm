package recursive;

import java.util.Scanner;

/*
 * 팩토리얼(https://www.acmicpc.net/problem/10872)
 */
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = recursive(n);
		System.out.println(result);
		sc.close();
	}

	private static int recursive(int n) {
		if (n <= 1) return 1; // 종료
		else return n * recursive(n - 1);
	}

}
