package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 유기농 배추
 * 1. 현재 노드 방문처리
 * 2. 현재 노드에서 상하좌우 노드로 갈 수 있는 지 확인 [ 초과여부 , 배추의 존재 여부 확인 ]
 *  -> 갈 수 있다면 dfs() 호출
 */
public class bfs {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int testCase;
	static boolean[][] arr;
	static boolean[][] checked;
	static int width, height, count, num;
	static StringTokenizer st;
	static StringBuffer sb;

	public static void main(String[] args) throws IOException {
		testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			count = 0;
			arr = new boolean[width][height];
			checked = new boolean[width][height];
			
			for (int j = 0; j < num; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x][y] = true;
			}

			for (int j = 0; j < width; j++) {
				for (int k = 0; k < height; k++) {
					// 경로 확인
					if (checkLocation(j, k)) {
						count++;
						dfs(j, k);
					}
				}

			}

			sb.append(count+"\n");
		}
		System.out.println(sb);
	}

	private static void dfs(int x, int y) {
		checked[x][y] = true;
		// 상하좌우 true 로 변경
		if (checkLocation(x - 1, y))
			dfs(x - 1, y);
		if (checkLocation(x + 1, y))
			dfs(x + 1, y);
		if (checkLocation(x, y + 1))
			dfs(x, y + 1);
		if (checkLocation(x, y - 1))
			dfs(x, y - 1);
	}

	private static boolean checkLocation(int row, int col) {
		// 좌표 값이 잘못된 경우
		if (row < 0 || row >= width || col < 0 || col >= height)
			return false;
		// 이미 지나가거나 배추가 없는 경우
		if (checked[row][col] == true || arr[row][col] == false)
			return false;
		return true;
	}

}
