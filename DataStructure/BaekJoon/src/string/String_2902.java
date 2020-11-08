package string;

import java.util.Scanner;

public class String_2902 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		String[] str = input.split("-");
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<str.length;i++) {
			char result = (char) str[i].charAt(0);
			sb.append(result);
		}
		System.out.println(sb.toString());
	}

}
