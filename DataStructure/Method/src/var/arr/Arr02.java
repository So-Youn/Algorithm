package var.arr;

import java.util.Scanner;

/*
 * n���� ������ �Է¹޾� �迭�� �����Ѵ�. �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ�
 * ���� �� �ִ� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ض�.
 * -- �߰��� ������ �ֱ� ������ ���� ���ϴ� ���� ���� �� �ƴϴ�.
 */
public class Arr02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for (int i=0; i<n;i++)
			data[i] = kb.nextInt();
		kb.close();
		//���̰� n�� ���� ��� �˻�
		//�� ����� �ߺ�, redundancy �����ؼ� ���� ��� x
		int max = 0;
		for (int i=0;i<n;i++) {
			for(int j=i;j<n;j++) { //�� ������ �� ���� ���������� ���ʿ� ���� �ʿ�� x = > ������ = �� ��
				int sum = 0;
				for (int k=i;k<=j;k++)
					sum += data[k]; //������ ��
				
				if ( sum > max )
					max = sum;
				//add data[i] ... data[j]
				//if the sum > max
				// max = the sum...
			}
		}
		System.out.println("the max sum is "+max);
	}
}