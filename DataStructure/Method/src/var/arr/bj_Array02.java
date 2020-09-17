package var.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 수 정렬하기 2(https://www.acmicpc.net/problem/2751)
 */
public class bj_Array02 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n=Integer.parseInt(br.readLine());
		 List<Integer> arr = new ArrayList<Integer>();
		 for(int i=0;i<n;i++) {
			 arr.add(Integer.parseInt(br.readLine()));
		 }
		 Collections.sort(arr);
		 for (Integer i : arr) {
			System.out.println(i);
		}

	}

}
