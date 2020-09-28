package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * 완주하지 못한 선수(https://programmers.co.kr/learn/courses/30/lessons/42576?language=java)
 */
public class Hash01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] participant = new String[1000];
		String[] completion = new String[1000];
		int i = 0;
		while (st.hasMoreTokens()) {
			participant[i] = st.nextToken();
			i++;
		}
		st = new StringTokenizer(br.readLine());
		int j = 0;
		while (st.hasMoreTokens()) {
			completion[j] = st.nextToken();
			j++;
		}
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String part : participant) {
			if (hashMap.containsKey(part)) {
				hashMap.put(part, hashMap.get(part) + 1);
			} else {
				hashMap.put(part, 1);
			}
		}
		for (String comp : completion) {
			// 완주자의 값으로 hashmap에서 확인하여 -1한 값을 셋팅
			hashMap.put(comp, hashMap.get(comp) - 1);
		}
		for (String key : hashMap.keySet()) { //keySet : 모든 key객체 반환
			
			if(hashMap.get(key)==1) {
				answer = key;
			}
		}
		
		return answer;
	}
}
