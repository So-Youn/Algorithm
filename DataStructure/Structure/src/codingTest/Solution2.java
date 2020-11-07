package codingTest;

import java.util.Arrays;

class Solution2 {

	/*
	 * Complete the 'balancedSum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */
	public static void main(String[] args) {
		String word = "APPLE";
		String result = lastLetters(word);
		System.out.println(result);
	}
	public static String lastLetters(String word) {
		// Write your code here
		String str="";
		int size = word.length();
		StringBuilder sb = new StringBuilder();
		char[] letter = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			letter[i] = word.charAt(i);
		}
		sb.append(letter[size-1]).append(letter[size-2]);
		return sb.toString();
	}

}
