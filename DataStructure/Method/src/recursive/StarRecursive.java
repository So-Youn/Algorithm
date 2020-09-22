package recursive;

import java.util.Scanner;

public class StarRecursive {
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		arr = new char[N][N];
		
		star(0, 0, N, false);
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				sb.append( arr[i][j] );
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}

	private static void star(int x, int y, int N, boolean blank) {
		/*
		 * 공백칸일 경우 - block에서 가운데 부분이 공백
		 *  N=3일 때 ,
		 *  2차원 배열이 선언되었다는 가정하에(arr[][])
		 *  인덱스는 0부터이므로 N=3일 때의 공백은 arr[1][1]
		 *  (0, 0), (0, 1), (0, 2), (1, 0) 까지는 별을 출력하고 
		 *  별 출력이 4 번 이루어지면 그다음 블럭은 반드시 공백
		 *  N = 9일때 , N=3일 때의 모양이 한 블럭이 되어 똑같이 되풀이
		 */
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		// 더이상 쪼갤 수 없는 블록일 때
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}

		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}

}
