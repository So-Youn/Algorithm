package level2;

import java.util.Arrays;
import java.util.Comparator;

public class Most_sort01 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 6, 10, 2 };
		// int[] numbers = new int[] {3, 30, 34, 5, 9};
		String returnV = solution(numbers);
		System.out.println(returnV);
	}

	public static String solution(int[] numbers) {
		String[] result = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = Integer.toString(numbers[i]);
			// ���� ���ڿ��� ��ȯ
		}
		// ����
		Arrays.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return ((o2 + o1).compareTo(o1 + o2));
			}
		});

		// 0�� ���� �� �ִ� �迭�� ��� �ϳ��� 0�� ����
		if (result[0].equals("0")) {
			return "0";
		}
		String answer = "";
		StringBuilder sb = new StringBuilder();
		for (String a : result) {
			sb.append(a);
		}
		return sb.toString();
	}
}
