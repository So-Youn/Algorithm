package level1;

import java.util.Scanner;

public class Sosu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = solution(N);
		sc.close();
		System.out.println(result);
	}

	private static int solution(int n) {
		int answer =0;
		boolean[] sosu = new boolean [n+1];
		for(int i=2;i<=n;i++) 
			sosu[i] = true; 
		//Á¦°ö±Ù
		int root = (int)Math.sqrt(n);
		for(int i=2;i<=root; i++) {
			if(sosu[i]==true) {
				for(int j=i;i*j<=n;j++) sosu[i*j] = false;
			}
		}
		for(int i=2;i<=n;i++) {
			if(sosu[i]==true) answer ++;
		}
		return answer;
	}

}
