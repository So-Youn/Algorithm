package method.function;
// 1 ~100000 ������ �Ҽ� ã��
public class PrimeTest {
	public static void main(String[] args) {
		for (int n=1 ; n<100000;n++) {
			if(isPrime(n)) //true�� ���� ���� ���
				System.out.println(n);
		}
	}
	static boolean isPrime(int k) {
		//�Ҽ����� Ȯ���ؼ� true, false ����
		//i=1�� �Ҽ��� �Ǵ��ؼ� ���� ����...
		if(k<2) return false;
		for (int i=2; i*i<k;i++)
			
			if(k % i ==0)
				return false;
		//���� return���� �������� �ʾҴٴ� ���� ������ �������� �ʴ� �Ҽ���.
		return true; 
				
	}
}
