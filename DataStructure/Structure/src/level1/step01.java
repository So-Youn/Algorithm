package level1;

import java.util.Scanner;

/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 
 */
public class step01 {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = solution(s);
		System.out.println(result);
		sc.close();
	}

	public static String solution(String s) {
		int index = s.length();
		if(index%2==0) {
			char c = s.charAt(index/2-1);
			char k = s.charAt(index/2);
			sb.append(c);
			sb.append(k);
		}else {
			char c = s.charAt(index/2);
			sb.append(c);
		}
		return sb.toString();
	}

}
