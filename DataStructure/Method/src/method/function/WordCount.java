package method.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * [�ε��� ����Ŀ]
 * -----------
 * �ؽ�Ʈ���Ͽ� �����ϴ� ��� �ܾ���� ����� �����, �� �ܾ �ؽ�Ʈ ���Ͽ� �����ϴ� Ƚ���� ����.
 * ����ڰ� ��û�ϸ� �ܾ� ����� �ϳ��� ���Ϸ� �����Ѵ�.
 * ����ڰ� �ܾ �˻��ϸ� �� �ܾ �ؽ�Ʈ ���Ͽ� �� �� �����ϴ��� ����Ѵ�.
 */
public class WordCount {
	// �ڷᱸ�� - ���� ����
	static String[] words = new String[100000];
	static int[] count = new int[100000];
	static int n = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("$ ");
			String command = sc.next();
			if (command.equals("read")) {
				String fileName = sc.next();
				makeIndex(fileName);
			} else if (command.equals("find")) {

			} else if (command.equals("saves")) {

			} else if (command.equals("exit"))
				break;

		}
		sc.close();
	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File!");
			return;//�ƹ��ϵ� ���� �ʵ���
		}
		
		
	}

}
