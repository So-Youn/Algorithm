package stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			Stack<Integer> stack = new Stack<>();
			char[] st = new char[T];
			boolean isVPS = true;
			String input = br.readLine();
			for (int j = 0; j < input.length(); j++) {
				st[i] = input.charAt(j);
				if (st[i] == '(') {
					stack.push(1);
				} else if (st[i] == ')') {
					if (stack.isEmpty()) {
						isVPS = false;
						break;
					} else {
						stack.pop();
					}
				}
			}
			if (!stack.isEmpty())
				isVPS = false;
			if (isVPS == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
