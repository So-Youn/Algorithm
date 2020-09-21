package recursive;

import java.util.Scanner;

/*
 * 피보나치(https://www.acmicpc.net/problem/10870)
 */
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacci(n));
	}

	private static int fibonacci(int n) {
		if(n<=1) return n;
		else return fibonacci(n-1) + fibonacci(n-2);
	}

}
