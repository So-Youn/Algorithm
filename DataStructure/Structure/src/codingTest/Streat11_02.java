package codingTest;

import java.util.Arrays;

//동일한 문제 찾기 _ 11번가_1번
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
