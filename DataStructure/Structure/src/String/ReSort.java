package String;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder();
		int sum =0;
		LinkedList<Character> arr = new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				arr.add(str.charAt(i));
			}else {
				sum+=(str.charAt(i)-'0');
			}
		}
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++) {
			sb.append(arr.get(i));
		}
		
		sb.append(sum);
		System.out.println(sb);
		
	}

}
