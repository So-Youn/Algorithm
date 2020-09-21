package recursive;

import java.util.Scanner;

//반복문 사용한 재귀함수
//재귀 호출이 없어 메모리도 덜 차지한다.(메모리 초과 방지)
public class factorial03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 1;
		//n이 0이 아닐대까지 1씩 감소하면서 sum에 반복적으로 곱해준다
		while(n!=0) {
			sum = sum * n;
			n--;
		}
		System.out.println(sum);
		sc.close();
	}

}
