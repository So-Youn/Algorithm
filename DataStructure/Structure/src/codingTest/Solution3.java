package codingTest;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		int result = balancedSum(arr);
		System.out.println(result);
	}

	public static int balancedSum(List<Integer> arr) {
		// Write your code here
		int answer = 0;
		int index = 0;
		for (int i = 0; i < arr.size() - 1; i++) {
			answer += arr.get(i);
			if (answer == arr.get(arr.size()-1)) {
				index = i+1;
			}
		}
		return index;

	}
}
