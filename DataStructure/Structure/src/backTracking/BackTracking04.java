package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * N-Queen (https://www.acmicpc.net/problem/9663)
 * N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
 * N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class BackTracking04 {
	public static int[] arr;
	public static int N;
	public static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		nQueen(0);
		System.out.println(count);
	}

	private static void nQueen(int depth) {
		// 원소를 다 채운 상태이면 count 증가 및 return
		if (depth == N) {
			count++;
			return;
		}
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			// 놓을 수 있는 위치면 재귀 호출
			if (Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	private static boolean Possibility(int col) {
		for (int i = 0; i < col; i++) {
			// 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
			if (arr[col] == arr[i]) {
				return false;
			}
			/*
			 * 대각선상에 놓여있는 경우 (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
			 */
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}
