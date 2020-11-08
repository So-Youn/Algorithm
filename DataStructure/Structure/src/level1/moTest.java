package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class moTest {

	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int[] result = solution(answers);
		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score1=0,score2 =0,score3=0;
        for(int i=0;i<answers.length;i++) {
        	if(answers[i] == p1[i%p1.length]) score1++;
        	if(answers[i] == p2[i%p2.length]) score2++;
        	if(answers[i] == p3[i%p3.length]) score3++;
        }
        int max = Math.max(score1, Math.max(score2, score3));
        List<Integer> list = new ArrayList<>();
        if(max == score1) list.add(1);
        if(max == score2) list.add(2);
        if(max == score3) list.add(3);
        
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
        	answer [i] = (int)list.get(i);
        }
        return answer;
    }
}
