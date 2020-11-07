package level1;

import java.util.*;

public class K_sort02 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] result = solution(array, commands);
		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int index = 0;

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int k = commands[i][2];

			int[] temp = new int[end - start + 1];
			int a = 0;
			for (int j = start - 1; j < end; j++) {
				temp[a++] = array[j];
			}
			Arrays.sort(temp);
			answer[index++] = temp[k - 1];
		}
		return answer;
	}
}
