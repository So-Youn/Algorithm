package method.function;
//a의 b승 구하기 
import java.util.Scanner;

public class PowerNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = power(a,b); //정수 2개를 매개변수로 받는 함수 호출
		System.out.println(result);
		
		
		sc.close();
		
	}
	
	public static int power(int n, int m){
		int prod = 1;
		for ( int i = 0; i<m ; i++)
			prod = prod * n;
		return prod;
	}

}
