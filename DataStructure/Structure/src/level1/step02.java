package level1;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
 * 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.
 */
public class step02 {

	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < strings.length; i++) {
			arr.add(strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(arr);
		answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i).substring(1, arr.get(i).length());
		}
		return answer;
	}
}
