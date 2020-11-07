package String;

import java.util.Scanner;

public class String02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] chess = new String[8];
		int res = 0;
		for(int i=0;i<8;i++) {
			chess[i]= sc.nextLine();
		}
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0 && j%2==0 && chess[i].charAt(j)=='F')res++;
				else if (i%2==1 && j %2 ==1 & chess[i].charAt(j)=='F') res++;
			}
		}
		System.out.println(res);
	}

}
