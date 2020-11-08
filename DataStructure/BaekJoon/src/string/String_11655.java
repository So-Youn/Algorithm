package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_11655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<input.length();i++) {
			list.add(i,input.charAt(i) );
			if(Character.isAlphabetic(input.charAt(i))) {
				if(Character.isAlphabetic((char)(input.charAt(i)+13))) {
					list.add(i, (char)(input.charAt(i)+13));
				}else {
					list.add(i, (char)(input.charAt(i)-13));
				}
			}
			System.out.print(list.get(i));
		}
	}

}
