package bruteForce;

import java.util.Scanner;
//텍스트(str1)에서 패턴(str2)을 검색해서 텍스트의 위치 반환.
//텍스트 스캔하기 위한 변수 pt, 패턴을 스캔하기 위한 변수 pp

public class BruteForce02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("텍스트 : ");
		String str1 = sc.next();
		System.out.print("패턴 : ");
		String str2 = sc.next();
		int idx = bfMatch(str1, str2);
		if (idx == -1)
			System.out.println("텍스트에 패턴이 없다.");
		else {
			int len = 0;
			for (int i = 0; i < idx; i++)
				len += str1.substring(i, i + 1).getBytes().length;
			len += str2.length();
			System.out.println((idx + 1) + "번쨰 문자부터 일치");
			System.out.println("텍스트 : " + str1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), str2);
		}

		sc.close();
	}

	private static int bfMatch(String str1, String str2) {
		int pt = 0;
		int pp = 0;

		while (pt != str1.length() && pp != str2.length()) {
			if (str1.charAt(pt) == str2.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == str2.length()) return pt - pp; //검색 성공
		return -1;
	};
}
