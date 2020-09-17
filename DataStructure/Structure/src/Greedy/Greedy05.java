package Greedy;

/*
 * ATM (https://www.acmicpc.net/problem/11399)
 * 기다린 시간의 합을 구하는 문제
 */
import java.util.Arrays;
import java.util.Scanner;

public class Greedy05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int[] time = new int[n];
		int wait=0;
		for(int i=0;i<n;i++) {
			time[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(time);
		for(int i=0;i<n;i++) {
			sum += time[i];
			wait+=sum;
		}
		System.out.println(wait);
	}

}
