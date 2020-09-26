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
		numbers.add(1,50); //(a,b) : a�� index, b�� ��
		System.out.println("numbers : "+numbers);
		
		//remove
		numbers.remove(2);
		System.out.println("numbers : "+numbers);
		
		//�� ��������(get)
		System.out.println("�� ��������(get) : "+numbers.get(2));
		//size ũ��
		System.out.println("size ũ�� : "+numbers.size());
		
		//��� 1)
		//ArrayList�� Ž���� ���� Iterator�� ����. (�ݺ� ���)
		//Iterator : interface
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			//��ȸ
			int value = it.next();
			//System.out.println(value);
			if(value == 30) it.remove();
		}
		
		//��� 2) for each
		for(int value : numbers) {
			System.out.println(value);
		}
		//��� 3) for
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		
	}

}
