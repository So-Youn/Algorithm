package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * ����(https://www.acmicpc.net/problem/2798)
 * ��ü ī��N���� 3���� �� �� �ִ� ����� ���� ��� Ž���Ͽ� �� ��� �� ������ ī���� ���� ��� ���ѵ�
 * M�� ���� �ʴ� �ִ��� ã�´�.
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
		//3���� ���� �빮�� ù ��° ī��� N-2������ ��ȸ
		for (int i=0; i<N-2;i++) {
			//�� ��° ī��� ù ��° ī�� �������� N-1������ ��ȸ
			for(int j=i+1; j<N-1;j++) {
				//�� ��° �ι�° ī�� �������� N���� ��ȸ
				for (int k=j+1;k<N;k++) {
					//3�� ī���� �� ����
					int max = card[i]+card[j]+card[k];
					//M�� �� ī���� ���� ���ٸ� max return
					if(M == max ) return max;
					//�� ī���� ���� ���� �� ���� ũ�鼭 M���� ���� ��� result ����
					if(result < max && max <M) result = max ;
					
				}
			}
		}
		return result;
	}

}
