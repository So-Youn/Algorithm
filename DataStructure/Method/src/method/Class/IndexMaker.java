package method.Class;

import java.awt.ItemSelectable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * [�ε��� ����Ŀ]
 * -----------
 *  �ܾ��� ��, �ڿ� ���� Ư������ �����ϱ�
 */
public class IndexMaker {
	// �ڷᱸ�� - ���� ����
	static Item[] items = new Item[100000];
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
				String str = sc.next();
				int index = findWord(str);
				if (index > -1) {
					System.out.println("The word " + items[index].word + " appears " + items[index].count + "times.");
				} else
					// word[-1] : indexOutOfBound ���� �߻�
					System.out.println("The word " + str + " does not appear.");
			} else if (command.equals("saves")) { // ���Ϸ� ����
				String fileName = sc.next();
				saveAs(fileName);

			} else if (command.equals("exit"))
				break;

		}
		sc.close();

	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while (inFile.hasNext()) {
				String str = inFile.next();
				String trimmed = trimming(str); // ��,�� Ư������ ����
				if (trimmed != null) {
					String lowerStr = trimmed.toLowerCase();
					addWord(lowerStr);
				}
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File!");
			return;// �ƹ��ϵ� ���� �ʵ���
		}

	}

	static String trimming(String str) {

		int i = 0, j = str.length() - 1;
		// while(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') //while i-th character is
		// not letter
		while (i <= str.length() && !Character.isLetter(str.charAt(i))) // i�� str���̸� �Ѿ�� �ȵȴ�.
			i++;
		while (j >= 0 && !Character.isLetter(str.charAt(i)))
			j--;

		// System.out.println(str + ":"+ i + ":"+ j);
		// ���� ���ڿ� �ȿ� ���ĺ��� �ϳ��� ������� ���� ��츦 �����ؾ���.
		if (i > j)
			return null;
		return str.substring(i, j + 1); // substring[ )
	}

	// ���ο� �ܾ� ��Ͽ� �߰��� ��
	static void addWord(String str) {
		int index = findWord(str); // returns -1 if not found
		if (index != -1) { // found
			items[index].count++;
		} else { // not found , ordered list�� insert [�ڿ������� �˻��ϴ� ���� �� ȿ����]
			int i = n - 1; // �� ������ ��ġ
			while (i >= 0 && items[i].word.compareTo(str) > 0) {
				items[i+1] = items[i];
				i--;
			}
			//��ü ���� �ʿ�
			items[i+1] = new Item();
			items[i+1].word= str;
			items[i+1].count = 1;
			n++; // �ܾ� ���� ����
		}
	}

	static int findWord(String str) {
		for (int i = 0; i < n; i++)
			if (items[i].word.equalsIgnoreCase(str))
				return i;
		return -1;

	}

	static void saveAs(String fileName) {
		// ���Ϸ� ���
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(fileName));
			for (int i = 0; i < n; i++)
				System.out.println(items[i].word + " : " + items[i].count);
			pw.close();
		} catch (IOException e) {
			System.out.println("Save failed");
			return;
		}

	}

}
