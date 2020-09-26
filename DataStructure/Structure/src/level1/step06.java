package level1;

import java.util.Scanner;

public class step06 {
	static int nowX;
	static int nowY;
	static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		int row = path.charAt(0) - 'a' + 1;
		int col = path.charAt(1) - '0';
		sc.close();
		int[] x = { -2, -2, 2, 2, -1, -1, 1, 1 };
		int[] y = { -1, 1, -1, 1, 2, -2, 2, -2 };
		for (int i = 0; i < x.length; i++) {
			nowX = row + x[i];
			nowY = col + y[i];
			if (nowX < 1 || nowY < 1 || nowX > 8 || nowY > 8) continue;
			count++;
		}
		System.out.println(count);
	}
}
