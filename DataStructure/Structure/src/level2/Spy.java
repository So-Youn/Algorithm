package level2;

import java.util.HashMap;

public class Spy {

	public static void main(String[] args) {
		String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int result = solution(clothes);
		System.out.println(result);
	}
	// ¿Ê Á¾·ù : ÃÑ °¹¼ö
	 public static int solution(String[][] clothes) {
	        int answer = 1;
	        HashMap<String, Integer> map = new HashMap<>();
	        for(int i=0;i<clothes.length;i++) {
	        	if(map.get(clothes[i][1]) == null) map.put(clothes[i][1], 1);
	        	else map.put(clothes[i][1], map.get(clothes[i][1])+1);
	        	
	        }
	        for(String keys:map.keySet()) { //keySet : ¸ðµç °´Ã¼ ¹ÝÈ¯
	        	answer *=(map.get(keys)+1);
	        }
	        answer -=1; //¸ðµÎ ¾ÈÀÔ´Â °æ¿ì »©±â
	        return answer;
	    }
}
