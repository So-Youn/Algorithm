package codingTest;

import java.util.ArrayList;

public class Skt01 {
	public static void main(String[] args) {
		String S = "OXXXOXOOX";
		String result = solution(S);
		System.out.println(result);

	}

	public static String solution(String S) {
		int N = S.length();
		int count = 1;
		char[] str = new char[N];
		ArrayList<String> win = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			str[i] = S.charAt(i);
		}
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] == str[i + 1]) {
				count++;
			} else
				count = 1;
			System.out.println(count);
			if (count == 3) {
				win.add(Character.toString(str[i]));
			}
			System.out.println(count);
		}
		// for(int i=0;i<win.size();i++) {
		// System.out.println(win.get(i));
		// }
		if (win.size() == 1)
			return win.get(0);
		else
			return "tie";
	}
}
