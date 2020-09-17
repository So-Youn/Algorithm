package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy04a {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Conferr[] time = new Conferr[n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			time[i] = new Conferr(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(time);
		int count = 0;
		int start=0;
		for (int i = 0; i < n; i++) {
			if (start <=time[i].start) {
				count++;
				start = time[i].end;
			}
		}
		System.out.println(count);

	}

}

class Conferr implements Comparable<Conferr> {
	int start;
	int end;

	public Conferr(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Conferr o) {
		if (this.end < o.end)
			return -1;
		 //끝나는 시간이 같다면 시작시간이 빠른 순으로 정렬
		 if (this.end == o.end) {
			return this.start - o.start;
		}
		return 1;
	}

}