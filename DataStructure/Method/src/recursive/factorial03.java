package recursive;

import java.util.Scanner;

//�ݺ��� ����� ����Լ�
//��� ȣ���� ���� �޸𸮵� �� �����Ѵ�.(�޸� �ʰ� ����)
public class factorial03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 1;
		//n�� 0�� �ƴҴ���� 1�� �����ϸ鼭 sum�� �ݺ������� �����ش�
		while(n!=0) {
			sum = sum * n;
			n--;
		}
		System.out.println(sum);
		sc.close();
	}

}
