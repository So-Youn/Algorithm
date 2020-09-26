package level1;

import java.io.IOException;
import java.util.Scanner;
// »óÇÏÁÂ¿ì
public class step04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] path = str.split(" ");
		sc.close();
		int nowX = 1, nowY = 1;
		for (int i = 0; i < path.length; i++) {
			if (path[i].equals("L")) {
				if (nowY == 1) continue;
				nowY -= 1;
			} else if (path[i].equals("R")) {
				if (nowY < N) nowY += 1;
			} else if (path[i].equals("U")) {
				if (nowX == 1) continue;
				nowX -= 1;
			} else if (path[i].equals("D")) {
				if (nowX < N) nowX += 1;
			}
		}
		System.out.println(nowX + " " + nowY);

	}
}
