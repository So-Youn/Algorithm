package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		String A = str.nextToken();
		String B = str.nextToken();
		int max_same = Integer.MAX_VALUE;
		
		for(int i=0;i<=B.length()-A.length();i++) {
			int count=0;
			for(int j=0;j<A.length();j++) {
				if(A.charAt(j)!=B.charAt(i+j))
					count++;
			}
			max_same = Math.min(count, max_same);
		}
		System.out.println(max_same);
	}
}
