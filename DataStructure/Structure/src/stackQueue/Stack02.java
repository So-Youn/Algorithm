package stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int num = 0, sum = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < K; i++) {
			num = Integer.parseInt(br.readLine());
			if (num == 0 && !stack.isEmpty())
				stack.pop();
			else
				stack.push(num);
		}
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}

}
