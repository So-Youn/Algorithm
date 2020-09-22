package recursive;

import java.util.Arrays;
import java.util.Scanner;

//자바 char[] 초기화시 자동 null 값 => ' '으로 선언해주어야 한다.
public class StarRecursive02 {
	public static char[][] arr;
	public static void StarArray(int x,int y,int num) {
		if(num==1) {
			arr[x][y] ='*';
			return;
		}
		int value = num/3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i == 1 && j == 1);
				else {
					//System.out.println(x+(value*i)+","+(y+(value*j))+","+value);
					StarArray(x+(value*i), y+(value*j), value);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int size = Integer.parseInt(sc.nextLine());
		sc.close();
		arr = new char[size][size];
		
		for(int i=0;i<size;i++) {
			Arrays.fill(arr[i], ' ');
		}
		StarArray(0, 0, size);
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
		
	}

}
