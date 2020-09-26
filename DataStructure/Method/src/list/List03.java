package list;

import java.io.IOException;
import java.util.Scanner;



public class List03 {
	static long sum=0;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		solution(x,n);
		sc.close();
	}

    public static long[] solution(int x, int n) {
    	long[] answer = new long[n];
        for(int i=0;i<n;i++) {
        	answer[i] = x;
        	sum+=x;
        }
        
        return answer;
    }
}
