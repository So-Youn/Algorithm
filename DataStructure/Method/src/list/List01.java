package list;

import java.util.ArrayList;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		//insert 
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(1,50); //(a,b) : a는 index, b는 값
		System.out.println("numbers : "+numbers);
		
		//remove
		numbers.remove(2);
		System.out.println("numbers : "+numbers);
		
		//값 가져오기(get)
		System.out.println("값 가져오기(get) : "+numbers.get(2));
		//size 크기
		System.out.println("size 크기 : "+numbers.size());
		
		//방법 1)
		//ArrayList를 탐색할 때는 Iterator를 쓴다. (반복 기법)
		//Iterator : interface
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			//순회
			int value = it.next();
			//System.out.println(value);
			if(value == 30) it.remove();
		}
		
		//방법 2) for each
		for(int value : numbers) {
			System.out.println(value);
		}
		//방법 3) for
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		
	}

}
