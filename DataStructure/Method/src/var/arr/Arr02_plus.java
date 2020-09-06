package var.arr;

import java.util.Scanner;

/*
 * n개의 정수를 입력받아 배열에 저장한다. 이들 중에서 0개 이상의 연속된 정수들을 더하여
 * 얻을 수 있는 최대값을 구하여 출력하는 프로그램을 작성해라.
 * -- 중간에 음수가 있기 때문에 많이 더하는 것이 좋은 것 아니다.
 */
public class Arr02_plus {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for (int i=0; i<n;i++)
			data[i] = kb.nextInt();
		kb.close();
		//길이가 n인 구간 모두 검사
		int max = 0;
		for (int i=0;i<n;i++) {
			int sum = 0; //출발점이 바뀔 때 sum 초기화
			for(int j=i;j<n;j++) { 
				sum += data[j]; //구간의 합
				if ( sum > max )
					max = sum;
			}
		}
		System.out.println("the max sum is "+max);
	}
}
