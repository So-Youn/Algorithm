package list;

public class List02 {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		//������ ��ġ�� �߰��ϱ�
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		System.out.println(numbers.get(1));
		//�߰���ġ�� �߰�
		numbers.add(1,15);
		//ù��° ��ġ�� �߰�
		numbers.addFirst(5); 
		System.out.println(numbers.size());
		System.out.println(numbers.indexOf(40));
	}

}
