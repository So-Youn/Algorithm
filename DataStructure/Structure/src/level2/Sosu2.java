package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Sosu2 {
	private TreeSet<String> set = new TreeSet<>();
	private int count;

	public static void main(String[] args) {
		String numbers = "011";
		Sosu2 s = new Sosu2();
		System.out.println(s.solution(numbers));
	}

	public int solution(String numbers) {
		int size = numbers.length();

		List<Character> arr = new ArrayList<Character>();
		for (int i = 0; i < size; i++) {
			arr.add(numbers.charAt(i));
		}

		// 결과 저장할 리스트
		List<Character> result = new ArrayList<>();
		// nPr에서 r 계속 늘리면서 순열 알고리즘 수행
		for (int i = 0; i < size; i++) {
			per(arr, result, size, i + 1);
		}
		return count;

	}

	private void per(List<Character> arr, List<Character> result, int n, int r) {
		if (r == 0) {
			// 0으로 시작하는 부분집합은 제외
			if (result.get(0) != '0') {
				String str = "";
				int size = result.size();
				for (int i = 0; i < size; i++) {
					str += result.get(i);
				}
				int num = 0;
				// 이미 나온 숫자 조합이 아닌 경우
				if (!set.contains(str)) {
					num = Integer.parseInt(str);
					set.add(str);
					// 소수 판별
					if (isPrime(num)) {
						System.out.println(num);
						count++;
					}
				}
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			result.add(arr.remove(i));
			per(arr, result, n - 1, r - 1);
			arr.add(i, result.remove(result.size() - 1));
		}
	}

	private boolean isPrime(int n) {
		int i;
		int sqrt = (int) Math.sqrt(n);
		if(n==2) return true; //짝수 소수
		//짝수, 1 X
		if(n%2 ==0 || n==1) return false;
		//제곱근까지만 홀수로 나눠보기
		for(i=3;i<=sqrt;i+=2) {
			if(n%i==0) return false;
		}
		return false;
	}

}
