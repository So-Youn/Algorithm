package String;

import java.util.Scanner;
//�� ���� ���� ����ϱ�(https://www.acmicpc.net/problem/11721)
public class String01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		cut(str);
		sc.close();
	}

	public static void cut(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 10 == 0 && i!=0) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}
		
	}

}
