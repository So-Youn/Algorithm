package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = factorial(N);
		System.out.println(sum);
	}

	private static int factorial(int n) {
		if (n <= 1) return 1; // Á¾·á
		else return n * factorial(n - 1);
	}

}
