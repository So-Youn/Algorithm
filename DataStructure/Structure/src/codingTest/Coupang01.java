package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Coupang01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] answer = solution(N);
		System.out.println(Arrays.toString(answer));
		
		
		

	}
	public static int[] solution(int N) {
		int[] answer = new int[2];
		int max = 1;
		for(int i=2;i<10;i++) {
			String str = change(N,i);
			int num = CheckMul(str);
			max = Math.max(max, num);
			if(max == num) {
				answer[0] = i;
			}
		}
		answer[1] = max;
		return answer;
	}
	private static int CheckMul(String str) {
		int result =1;
		for(int i=0;i<str.length();i++) {
			int num = str.charAt(i)-'0';
			if(num != 0) result *= num;
		}
		return result;
	}
	private static String change(int N, int i) {
		String changeN = "";
		while(N!=0) {
			if(N%i <10) {
				changeN = (N % i) + changeN;
				N/=i;
			}
		}
		return changeN;
	}
}
