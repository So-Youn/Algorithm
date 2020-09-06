package method.function;
// 1 ~100000 사이의 소수 찾기
public class PrimeTest {
	public static void main(String[] args) {
		for (int n=1 ; n<100000;n++) {
			if(isPrime(n)) //true일 때만 정수 출력
				System.out.println(n);
		}
	}
	static boolean isPrime(int k) {
		//소수인지 확인해서 true, false 리턴
		//i=1을 소수로 판단해서 오류 존재...
		if(k<2) return false;
		for (int i=2; i*i<k;i++)
			
			if(k % i ==0)
				return false;
		//위의 return문을 실행하지 않았다는 것은 나누어 떨어지지 않는 소수임.
		return true; 
				
	}
}
