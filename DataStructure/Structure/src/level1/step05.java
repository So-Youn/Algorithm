package level1;

import java.util.Scanner;

public class step05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int count = 0;
		for (int h = 0; h <= N; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					if (include(h, m, s))
						count++;
				}
			}
		}
		System.out.println(count);
	}

	static boolean include(int h, int m, int s) {
		if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
			return true;
		return false;
	}

}
