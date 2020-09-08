package method.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
				String str = sc.next();
				int index = findWord(str);
				if(index > -1) {
					System.out.println("The word "+ words[index]+" appears "+ count[index]+"times.");
				} else
					//word[-1] : indexOutOfBound ���� �߻�
					System.out.println("The word "+ str +" does not appear.");
			} else if (command.equals("saves")) { //���Ϸ� ����
				String fileName = sc.next();
				saveAs( fileName );

			} else if (command.equals("exit"))
				break;

		}
		sc.close();

	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next();
				addWord(str);
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File!");
			return;//�ƹ��ϵ� ���� �ʵ���
		}
		
		
	}

	static void addWord(String str) {
		int index = findWord(str); //returns -1 if not found
		if( index != -1) { //found
			count[index]++;
		} else { //not found
			words[n] = str;
			count[n] = 1;
			n++; //�ܾ� ���� ����
		}
	}
	static int findWord(String str) {
		for ( int i =0; i<n; i++) 
			if ( words[i].equalsIgnoreCase(str)) 
				return i;
		return -1;
		
	}
	static void saveAs(String fileName) {
		//���Ϸ� ���
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(fileName));
			for(int i=0;i<n;i++)
				System.out.println(words[i]+" "+count[i]);
			pw.close();
		} catch (IOException e) {
			System.out.println("Save failed");
			return;
		}
		
	}

}