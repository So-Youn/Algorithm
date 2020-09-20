package Greedy;

import java.util.Scanner;

public class Greedy09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		int mok;
		while (true) {
			if (n % k == 0) {
				result += 1;
				n /= k;
			} else {
				mok = (n % k);
				n -= mok;
				result += mok;
				
			}
			if (n == 1)
				break;
		}
		System.out.println(result);
		sc.close();
	}

}
