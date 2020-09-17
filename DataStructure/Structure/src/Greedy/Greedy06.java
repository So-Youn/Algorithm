package Greedy;

import java.util.Scanner;

/*
 * ÀÒ¾î¹ö¸° °ýÈ£(https://www.acmicpc.net/problem/1541)
 */
public class Greedy06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] num = str.split("\\-");
		int min =0;
		for(int i=0;i<num.length;i++) {
			int calcNum = calc(num[i]);
			
			if(i==0) calcNum*=-1;
			min -= calcNum;
		}
		System.out.println(min);
		
		sc.close();
	}

	private static int calc(String str) {
		String[] Nums = str.split("\\+");
		int result = 0;
		for (String number : Nums) {
			result += Integer.parseInt(number);
		}
		return result;
	}

}
