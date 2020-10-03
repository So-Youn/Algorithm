package String;

import java.util.Scanner;

/*
 * KaKao ���� (https://programmers.co.kr/learn/courses/30/lessons/60057?language=java)
 * ����Լ� ����� ������ !!!!
 */
public class StrCompress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int answer = solution(str);
		System.out.println(answer);
	}

	public static int solution(String s) {
		int answer = 0;

		for (int i = 1; i <= (s.length() / 2) + 1; i++) {
			int result = getSplitedLength(s, i, 1).length();
			answer = i == 1 ? result : (answer > result ? result : answer);
		}

		return answer;
	}

	public static String getSplitedLength(String s, int n, int repeat) {
		if (s.length() < n)
			return s;
		String result = "";
		String preString = s.substring(0, n);
		String postString = s.substring(n, s.length());

		// ����ġ -> ������� [�ݺ�Ƚ�� + �ݺ�����] ����
		if (!postString.startsWith(preString)) {
			if (repeat == 1)
				return result += preString + getSplitedLength(postString, n, 1);
			return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
		}

		return result += getSplitedLength(postString, n, repeat + 1);
	}
}
