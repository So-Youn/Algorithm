package method.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * [인덱스 메이커]
 * -----------
 *  단어의 앞, 뒤에 붙은 특수문자 제거하기
 */
public class WordCount2 {
	// 자료구조 - 변수 저장
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
				if (index > -1) {
					System.out.println("The word " + words[index] + " appears " + count[index] + "times.");
				} else
					// word[-1] : indexOutOfBound 에러 발생
					System.out.println("The word " + str + " does not appear.");
			} else if (command.equals("saves")) { // 파일로 저장
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
				String trimmed = trimming(str); // 앞,뒤 특수문자 제거
				if (trimmed != null) {
					String lowerStr = trimmed.toLowerCase();
					addWord(lowerStr);
				}
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File!");
			return;// 아무일도 하지 않도록
		}

	}

	static String trimming(String str) {

		int i = 0, j = str.length() - 1;
		// while(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') //while i-th character is
		// not letter
		while (i <= str.length() && !Character.isLetter(str.charAt(i))) // i가 str길이를 넘어가면 안된다.
			i++;
		while (j >= 0 && !Character.isLetter(str.charAt(i)))
			j--;

		// System.out.println(str + ":"+ i + ":"+ j);
		// 원래 문자열 안에 알파벳이 하나도 들어있지 않을 경우를 생각해야함.
		if (i > j)
			return null;
		return str.substring(i, j + 1); // substring[ )
	}

	// 새로운 단어 목록에 추가할 때
	static void addWord(String str) {
		int index = findWord(str); // returns -1 if not found
		if (index != -1) { // found
			count[index]++;
		} else { // not found , ordered list에 insert [뒤에서부터 검사하는 것이 더 효율적]
			int i = n - 1; // 맨 마지막 위치
			while (i >= 0 && words[i].compareTo(str) > 0) {
				words[i + 1] = words[i];
				count[i + 1] = count[i];
				i--;
			}

			words[n] = str;
			count[n] = 1;
			n++; // 단어 갯수 증가
		}
	}

	static int findWord(String str) {
		for (int i = 0; i < n; i++)
			if (words[i].equalsIgnoreCase(str))
				return i;
		return -1;

	}

	static void saveAs(String fileName) {
		// 파일로 출력
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(fileName));
			for (int i = 0; i < n; i++)
				System.out.println(words[i] + " " + count[i]);
			pw.close();
		} catch (IOException e) {
			System.out.println("Save failed");
			return;
		}

	}

}
