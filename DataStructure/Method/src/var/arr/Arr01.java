package var.arr;

import java.util.Scanner;

//사용자로부터 먼저 정수의 개수를 n개 입력받는다. 이어서 n개의 정수를 입력받아 순서대로 배열에 저장한다.
//그런 다음 중복된 정수 쌍의 개수를 카운트하여 출력하라.
//예를 들어 n=6이고 입력된 정수들이 2,4,2,4,5,2 이면 중복된 정수쌍은
// (2,2), (2,2), (2,2), (4,4)로 모두 4쌍이다.
public class Arr01 {
	
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int[] data = new int [n];
	
	for (int i=0; i<n;i++)
		data[i] = kb.nextInt();
	kb.close();
	//모든 쌍을 검사하여 쌍이 같은 값이면 더해주기
	//중첩된 반복문 패턴
	int count = 0;
	for  (int i=0;i<n;i++) {
		for (int j=i+1;j<n;j++) { // i < j
			//data[i] = data[j] 검사
			if(data[i] == data[j])
				count++;
		}
	}
	System.out.println(count);
		
	}

}
