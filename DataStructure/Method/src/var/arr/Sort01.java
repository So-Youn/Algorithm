package var.arr;

import java.util.Scanner;

/*
 * ����ڷκ��� n���� ������ �Է¹��� �� ������������ �����Ͽ� ����ϴ� �ڵ��̴�.
 * [Bubblesort]
 * ------------
 * data[0] ~ data[i] �߿��� �ִ밪�� data[i]��ġ�� ���ư��� ��
 */
public class Sort01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for (int i=0; i<n;i++)
			data[i] = kb.nextInt();
		kb.close();
		
		bubbleSort(n, data); //�迭�� ��ä�� �Ű������� �Ѱ��ش�.
		
		System.out.println("Sorted data >>");
		for( int i=0;i<n;i++)
			System.out.print(data[i]+" ");
	}
	
	static void bubbleSort(int n, int[] data){ //���ĸ� ���ָ� �Ǵ� ���� �������� �ʿ�� ����.(void)
		for(int i=n-1;i>0;i--) {
			//data[0] ... data[i]
			for(int j=0;j<i;j++) {
				if(data[j] > data[j+1]) {
					//swap data[j] and data[j+1]
					swap(data[j], data[j+1]);
				}
			}
		}
	}

	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
 