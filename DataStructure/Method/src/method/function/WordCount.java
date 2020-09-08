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
 * 텍스트파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에 등장하는 횟수를 센다.
 * 사용자가 요청하면 단어 목록을 하나의 파일로 저장한다.
 * 사용자가 단어를 검색하면 그 단어가 텍스트 파일에 몇 번 등장하는지 출력한다.
 */
public class WordCount {
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
				if(index > -1) {
					System.out.println("The word "+ words[index]+" appears "+ count[index]+"times.");
				} else
					//word[-1] : indexOutOfBound 에러 발생
					System.out.println("The word "+ str +" does not appear.");
			} else if (command.equals("saves")) { //파일로 저장
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
			return;//아무일도 하지 않도록
		}
		
		
	}

	static void addWord(String str) {
		int index = findWord(str); //returns -1 if not found
		if( index != -1) { //found
			count[index]++;
		} else { //not found
			words[n] = str;
			count[n] = 1;
			n++; //단어 갯수 증가
		}
	}
	static int findWord(String str) {
		for ( int i =0; i<n; i++) 
			if ( words[i].equalsIgnoreCase(str)) 
				return i;
		return -1;
		
	}
	static void saveAs(String fileName) {
		//파일로 출력
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
