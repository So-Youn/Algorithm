package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Hash01_2 {

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
	public static  String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String part : participant) {
			hashMap.put(part, hashMap.getOrDefault(part, 0)+1);
		}
		for (String part : completion) { //part가 completion에 있으면 0으로 value변환
			hashMap.put(part, hashMap.get(part)-1);
		}
		for(String key : hashMap.keySet()) {
			if(hashMap.get(key)!=0) {
				answer = key;
			}
		}
		return answer;
	}

}
