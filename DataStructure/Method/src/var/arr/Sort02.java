package var.arr;

import java.util.Scanner;

/*
 * ������ �ϳ��� �Էµ� ������ ������� �Էµ� �������� ������������ �����Ͽ� ����Ѵ�.
 * ---> ����ȭ�� list�� ���ο� �� �����ִ� �˰���
 * ------->���� �߶� �� ���� ��
 */
public class Sort02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for (int i=0; i<n;i++) {
			int tmp = kb.nextInt();
			//�迭�� �ڿ������� ��ġ�� ã�´�.(i��)
			
			int j = i-1;
			while(data[j] > tmp) {
				data[j+1] = data[j]; //��ĭ �ڷ� �̵�
				j--;
			}
			//���� j��ġ�� �� data[j]�� tmp���� ���� �� tmp��ġ�� data[j+1]�� �ȴ�.
			data[j+1] = tmp;
			
			for(int k=0; k<= i; k++)
				System.out.print(data[k]+ " ");
			System.out.println();
		}
		kb.close();
	}

}
