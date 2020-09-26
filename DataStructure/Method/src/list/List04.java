package list;

import java.util.Arrays;

public class List04 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        
        for(int i=0;i<commands.length;i++) {
        	int start = commands[i][0];
        	int end = commands[i][1];
        	int k = commands[i][2];
        	
        	int[] result = new int[end-start+1];
        	
        	int a=0;
        	for(int j = start-1;j<end;j++)
        		result[a++] = array[j];
        	Arrays.sort(result);
        	answer[index++] = result[k-1];
        }
        return answer;
    }
}
