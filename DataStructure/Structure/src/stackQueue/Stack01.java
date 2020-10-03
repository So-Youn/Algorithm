package stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack01 {
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if (command.equals("push")) {
				int input = Integer.parseInt(st.nextToken());
				stack.push(input);
			} else if (command.equals("pop")) {
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
			} else if (command.equals("size")) {
				System.out.println(stack.size());
			} else if (command.equals("empty")) {
				System.out.println(stack.isEmpty() ? 1 : 0);
			} else if (command.equals("top")) {
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
			}
		}
	}
}
