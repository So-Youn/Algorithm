package list;

public class List02 {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		//마지막 위치에 추가하기
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		System.out.println(numbers.get(1));
		//중간위치에 추가
		numbers.add(1,15);
		//첫번째 위치에 추가
		numbers.addFirst(5); 
		System.out.println(numbers.size());
		System.out.println(numbers.indexOf(40));
	}

}
