package method.function;

import java.util.Scanner;

public class basic {
	static String[] names = new String[1000];
	static int[] numbers = new int[1000]; //������ �迭
	static int n = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for(int i=0; i<k;i++) {
			names[i] = sc.next(); //���ڿ��� string �迭
			numbers[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0;i<k;i++) {
			System.out.println((i+1)+" Name: "+names[i]+", Numbers: "+numbers[i]);
		}
	}
	
	public void func() {
		
	}
}
