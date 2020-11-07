package level2;

import java.util.HashMap;

public class Spy2 {

	public static void main(String[] args) {
		String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int result = solution(clothes);
		System.out.println(result);
	}
	// ¿Ê Á¾·ù : ÃÑ °¹¼ö
	 public static int solution(String[][] clothes) {
	       HashMap<String, Integer> hash = new HashMap<>();
	       int answer = 1;
	       for(int i=0;i<clothes.length;i++) hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 1)+1);
	       for(int i :hash.values()) {
	    	   answer *= i;
	       }
	       return answer -1;
	 }
}
