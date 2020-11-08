package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Hash_1764 {
	//해쉬 셋 - 시간초과 방지
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		String[] bperson = new String[M];
		int count =0;
		HashSet<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			set.add(br.readLine());
		}
		for(int i=0;i<M;i++) {
			bperson[i] = br.readLine();
			if(set.contains(bperson[i])) {
				count++;
				list.add(bperson[i]);
			}
		}
		Collections.sort(list);
		System.out.println(count);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
