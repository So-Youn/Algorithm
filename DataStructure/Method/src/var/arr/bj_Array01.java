package var.arr;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 수 정렬하기(https://www.acmicpc.net/problem/2750)
 */
public class bj_Array01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i);
		}
		sc.close();
	}

}
