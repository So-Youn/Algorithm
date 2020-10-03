package String;

import java.util.Scanner;

/*
 * KaKao 기출 (https://programmers.co.kr/learn/courses/30/lessons/60057?language=java)
 */
public class StrCompress_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int answer = solution(str);
		System.out.println(answer);
	}

	public static int solution(String s) {
		int answer = s.length();
		for (int i = 1; i <= s.length() / 2+1; i++) {
			int result = check(s, i);
			if (result < answer)
				answer = result;
		}
		return answer;
	}

	private static int check(String s, int size) {
		String result = "";
		String cut = s.substring(0, size);
		int count = 1;
		for (int i = size; i < s.length(); i += size) {
			String sub = "";
			for (int j = i; j < i + size; j++) {
				if (j < s.length())
					sub += s.charAt(j);
			}
			if (cut.equals(sub))
				count += 1;
			else {
				//count >= 2 이면 count + cut
				result += (count >= 2) ? count + cut : cut;
				sub = "";
				for (int j = i; j < i + size; j++) {
					if (j < s.length())
						sub += s.charAt(j);
				}
				cut = sub;
				count = 1;
			}
		}
		// 남아있는 문자열에 대해서 처리
		result += (count >= 2) ? count + cut : cut;
		// 만들어지는 압축 문자열이 가장 짧은 것이 정답
		return Math.min(s.length(), result.length());
	}
}
