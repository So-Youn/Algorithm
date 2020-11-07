package level2;

import java.util.*;

public class Most_sort02 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 6, 10, 2 };
		// int[] numbers = new int[] {3, 30, 34, 5, 9};
		String returnV = solution(numbers);
		System.out.println(returnV);
	}

	public static String solution(int[] numbers) {
		String answer = "";
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<numbers.length;i++) list.add(numbers[i]);
		Collections.sort(list,(a,b) -> {
			String as = String.valueOf(a), bs = String.valueOf(b);
			return Integer.compare(Integer.parseInt(as+bs),Integer.parseInt(bs+as));
		});
		StringBuilder sb = new StringBuilder();
		for(Integer i: list) {
			sb.append(i);
		}
		answer = sb.toString();
		if(answer.charAt(0) =='0') return "0";
		else return answer;
	}
}
