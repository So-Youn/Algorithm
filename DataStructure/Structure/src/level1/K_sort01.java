package level1;

import java.util.*;

public class K_sort01 {

	public static void main(String[] args) {
	int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
	int[][] commands = new int[][]{{2, 5, 3},{4, 4, 1},{1,7,3}};
	int[] result = solution(array,commands);
	System.out.println(Arrays.toString(result));
	}
	// Arrays.copyOf(원본배열, 복사할 길이);
	// Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스)
	// - > 인덱스는 0부터 시작하는것 기준

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
			Arrays.sort(temp); // 정렬
			answer[i] = temp[commands[i][2]-1]; // k번째 
		}
		return answer;
		}
	}


