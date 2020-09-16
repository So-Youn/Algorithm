package Greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 회의실 배정(https://www.acmicpc.net/problem/1931)
 * 
 */
public class Greedy04 {
	static int n;
	static boolean checked;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 회의 갯수
		Session[] time = new Session[n];
		for (int i = 0; i < n; i++) {
			time[i] = new Session(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(time);
		int count =1;
		int end = time[0].end;
		for(int i=0;i<n;i++) {
			if(time[i].start>=end) {
				count++;
				end = time[i].end;
			}
		}
		System.out.println(count);
		sc.close();

	}


}
class Session implements Comparable<Session>{
	int start;
	int end;
	public Session(int start,int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Session o) {
		int r = this.end - o.end;
		if(r==0) r = this.start - o.start;
		return r;
	}
}
