package var.arr;

import java.util.Scanner;

//����ڷκ��� ���� ������ ������ n�� �Է¹޴´�. �̾ n���� ������ �Է¹޾� ������� �迭�� �����Ѵ�.
//�׷� ���� �ߺ��� ���� ���� ������ ī��Ʈ�Ͽ� ����϶�.
//���� ��� n=6�̰� �Էµ� �������� 2,4,2,4,5,2 �̸� �ߺ��� ��������
// (2,2), (2,2), (2,2), (4,4)�� ��� 4���̴�.
public class Arr01 {
	
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int[] data = new int [n];
	
	for (int i=0; i<n;i++)
		data[i] = kb.nextInt();
	kb.close();
	//��� ���� �˻��Ͽ� ���� ���� ���̸� �����ֱ�
	//��ø�� �ݺ��� ����
	int count = 0;
	for  (int i=0;i<n;i++) {
		for (int j=i+1;j<n;j++) { // i < j
			//data[i] = data[j] �˻�
			if(data[i] == data[j])
				count++;
		}
	}
	System.out.println(count);
		
	}

}
