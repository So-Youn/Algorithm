package method.function;

import java.util.Scanner;

public class CalcTest {

	static Polynomial[] polys = new Polynomial[100]; // ������������ �迭
	static int n = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = sc.next();
			if (command.equals("create")) {
				char name = sc.next().charAt(0); // ���̰� 1�� ���ڿ� �Է� -> char
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].terms = new Term[100];
				polys[n].nTerms = 0;
				n++;

			} else if (command.equals("add")) { // add f 2 3
				char name = sc.next().charAt(0);
				int index = find(name);
				if (index == -1)
					System.out.println("No such polynomial exists.");
				else {
					int c = sc.nextInt();
					int e = sc.nextInt();
					polys[index].addTerm(c, e);

				}

			} else if (command.equals("calc")) {
				char name = sc.next().charAt(0);
				int index = find(name);
				if (index == -1) System.out.println("No such polynomial exists.");
				else {
					int x = sc.nextInt(); //�Է¹޴� ���� ��
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);
										
				}
			} else if (command.equals("print")) {
				char name = sc.next().charAt(0);
				int index = find(name);
				if (index == -1) System.out.println("No such polynomial exists.");
				else {
					polys[index].printPolynomial();
				}
			} else if (command.equals("exit"))
				break;
		}
		sc.close();

	}
	//�� ���׽Ŀ� �����ִ� �Լ��� �ƴϴ�, main�� ���´�.
	private static int find(char name) {
		for (int i = 0; i < n; i++)
			if (polys[i].name == name)
				return i;
		return -1;
	}
}
