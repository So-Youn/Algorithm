package bruteForce;

import java.util.Scanner;
//�ؽ�Ʈ(str1)���� ����(str2)�� �˻��ؼ� �ؽ�Ʈ�� ��ġ ��ȯ.
//�ؽ�Ʈ ��ĵ�ϱ� ���� ���� pt, ������ ��ĵ�ϱ� ���� ���� pp

public class BruteForce02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ؽ�Ʈ : ");
		String str1 = sc.next();
		System.out.print("���� : ");
		String str2 = sc.next();
		int idx = bfMatch(str1, str2);
		if (idx == -1)
			System.out.println("�ؽ�Ʈ�� ������ ����.");
		else {
			int len = 0;
			for (int i = 0; i < idx; i++)
				len += str1.substring(i, i + 1).getBytes().length;
			len += str2.length();
			System.out.println((idx + 1) + "���� ���ں��� ��ġ");
			System.out.println("�ؽ�Ʈ : " + str1);
			System.out.printf(String.format("���� : %%%ds\n", len), str2);
		}

		sc.close();
	}

	private static int bfMatch(String str1, String str2) {
		int pt = 0;
		int pp = 0;

		while (pt != str1.length() && pp != str2.length()) {
			if (str1.charAt(pt) == str2.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == str2.length()) return pt - pp; //�˻� ����
		return -1;
	};
}
