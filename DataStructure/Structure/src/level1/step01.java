package level1;

import java.util.Scanner;

/*
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
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
