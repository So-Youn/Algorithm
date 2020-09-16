package var.arr;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEX {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr); //String�� Comparable������ ���� ����
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //��ҹ��� ���� ����
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); //���� ����
		System.out.println("strArr="+Arrays.toString(strArr));
	}

}

class Descending implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable<Object> 	c1 = (Comparable<Object>) o1;
			Comparable<Object> 	c2 = (Comparable<Object>) o2;
			return c1.compareTo(c2) * -1; //-1�� ���ؼ� �⺻ ���Ĺ���� ������ �����Ѵ� 
										//�Ǵ� c2.compareTo(c1)�� ���� ������ �ٲ㵵 �ȴ�.
		}
		return -1;
	}
}