package var.arr;

import java.util.Scanner;

/*
 * n���� ������ �Է¹޾� �迭�� �����Ѵ�. �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ�
 * ���� �� �ִ� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ض�.
 * -- �߰��� ������ �ֱ� ������ ���� ���ϴ� ���� ���� �� �ƴϴ�.
 */
public class Arr02_plus {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for (int i=0; i<n;i++)
			data[i] = kb.nextInt();
		kb.close();
		//���̰� n�� ���� ��� �˻�
		int max = 0;
		for (int i=0;i<n;i++) {
			int sum = 0; //������� �ٲ� �� sum �ʱ�ȭ
			for(int j=i;j<n;j++) { 
				sum += data[j]; //������ ��
				if ( sum > max )
					max = sum;
			}
		}
		System.out.println("the max sum is "+max);
	}
}
