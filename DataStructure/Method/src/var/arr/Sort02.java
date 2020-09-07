package var.arr;

import java.util.Scanner;

/*
 * 정수가 하나씩 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬하여 출력한다.
 * ---> 순서화된 list에 새로운 값 끼워넣는 알고리즘
 * ------->절반 잘라서 그 값과 비교
 */
public class Sort02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for (int i=0; i<n;i++) {
			int tmp = kb.nextInt();
			//배열의 뒤에서부터 위치를 찾는다.(i개)
			
			int j = i-1;
			while(data[j] > tmp) {
				data[j+1] = data[j]; //한칸 뒤로 이동
				j--;
			}
			//현재 j위치일 때 data[j]가 tmp보다 작을 때 tmp위치는 data[j+1]이 된다.
			data[j+1] = tmp;
			
			for(int k=0; k<= i; k++)
				System.out.print(data[k]+ " ");
			System.out.println();
		}
		kb.close();
	}

}
