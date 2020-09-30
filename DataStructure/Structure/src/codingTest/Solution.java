package codingTest;

import java.util.Scanner;

public class Solution {
	private static int index;
	private static String confirm_id;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String new_id = sc.next();
		if (1 <= new_id.length() && new_id.length() <= 1000)
			confirm_id = solution(new_id);
		System.out.println(confirm_id);
		sc.close();

	}

	public static String solution(String new_id) {
		String lowerId = new_id.toLowerCase();
		String replaceId = lowerId.replaceAll("[^a-z0-9-_.]", "");
		String rep_id = replaceId.replaceAll("\\.{2,}", ".");
		rep_id = replaceFirst(rep_id);
		rep_id = nullCheck(rep_id);
		rep_id = replaceLast(rep_id);
		rep_id = nullCheck(rep_id);
		index = rep_id.length();
		if (index >= 16) {
			rep_id = rep_id.substring(0, 15);
			rep_id = replaceLast(rep_id);
		}
		if (index <= 2)
			while (index < 3) {
				rep_id += rep_id.charAt(index - 1);
				index++;

			}
		return rep_id;
	}

	public static String replaceFirst(String rep_id) {
		if (rep_id.charAt(0) == '.') {
			rep_id = rep_id.replaceFirst(".", "");
		}
		return rep_id;
	}

	public static String replaceLast(String rep_id) {
		if(rep_id.endsWith(".")) {
			rep_id = rep_id.substring(0, rep_id.length()-1);
		}
		return rep_id;
	}

	public static String nullCheck(String rep_id) {
		if (rep_id.equals("")) {
			rep_id = "a";
		}
		return rep_id;
	}

}
