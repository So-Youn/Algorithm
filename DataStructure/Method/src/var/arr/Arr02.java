package var.arr;

import java.util.Scanner;

/*
 * n���� ������ �Է¹޾� �迭�� �����Ѵ�. �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ�
 * ���� �� �ִ� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ض�.
 */
public class Arr02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for (int i=0; i<n;i++)
			data[i] = kb.nextInt();
		kb.close();	
	}
}
