package String;

import java.util.Scanner;
/*
 * 럭키 스트레이트(https://www.acmicpc.net/problem/18406)
 */
public class LuckyStraight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int Str_len = str.length();
		int left_sum=0,total=0;
		for(int i=0;i<Str_len;i++) {
			int num = str.charAt(i)-'0';
			total+=num;
			for(int j=0;j<Str_len/2;j++) {
				left_sum+=num;
			}
		}
		if((total-left_sum) == left_sum) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
		sc.close();
	}

}
