package codingTest;

import java.util.Arrays;

//������ ���� ã�� _ 11����_1��
public class Streat11_02 {

	public static void main(String[] args) {
		String[] S = new String[] {"abc","bca","dbe"};
		int[] result = solution(S);
		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(String[] S) {
		int[] answer = new int[S.length];
		for(int i=0;i<S.length;i++) {
			for(int j = i+1;j<S.length;j++) {
				for(int k=0;k<S[i].length();k++) {
					//
					}
				}
			}
		}
		return answer;
	}
}
