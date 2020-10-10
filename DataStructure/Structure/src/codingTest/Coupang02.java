package codingTest;

import java.util.ArrayList;

public class Coupang02 {

	public static void main(String[] args) {
//		int[] score = { 24, 22, 20, 10, 5, 3, 2, 1 };
		int[] score = { 1300000000, 700000000, 668239490, 618239490, 568239490, 568239486, 518239486, 157658638,
				157658634, 100000000, 100 };
		System.out.println(solution(2, score));

	}

	public static int solution(int k, int[] score) {
		int answer = -1;
		int N = score.length;
		int num = 0;
		int temp = 0, remain = 0;
		int[] diff = new int[N];
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			if(i!=0) diff[i] = Math.abs(score[i] - score[i - 1]);
			list.add(score[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			num = diff[i];
			for (int j = i; j < diff.length; j++) {
				if (diff[j] == num) {
					count++;
				}
				temp = Math.max(temp, count);
				list.set(i, temp);
			}
			if (list.get(i) >=temp) {
				list.remove(i);
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		answer = list.size();
		return answer;
	}
}
