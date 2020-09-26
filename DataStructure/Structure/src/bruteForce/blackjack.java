package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 블랙잭(https://www.acmicpc.net/problem/2798)
 * 전체 카드N에서 3개를 고를 수 있는 경우의 수를 모두 탐색하여 각 경우 별 선택한 카드의 합을 모두 구한뒤
 * M을 넘지 않는 최댓값을 찾는다.
 */
public class blackjack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] card = new int[N];
		for(int i=0;i<N;i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		int result = search(card, N, M);
		System.out.println(result);
		
	}
	
	public static int search(int[] card, int N, int M) {
		int result = 0;
		//3개를 고르기 대문에 첫 번째 카드는 N-2까지만 순회
		for (int i=0; i<N-2;i++) {
			//두 번째 카드는 첫 번째 카드 다음부터 N-1까지만 순회
			for(int j=i+1; j<N-1;j++) {
				//세 번째 두번째 카드 다음부터 N까지 순회
				for (int k=j+1;k<N;k++) {
					//3개 카드의 합 변수
					int max = card[i]+card[j]+card[k];
					//M과 세 카드의 합이 같다면 max return
					if(M == max ) return max;
					//세 카드의 합이 이전 합 보다 크면서 M보다 작을 경우 result 갱신
					if(result < max && max <M) result = max ;
					
				}
			}
		}
		return result;
	}

}
