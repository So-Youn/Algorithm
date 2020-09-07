package method.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * file 읽은 후 출력하기
 */
public class FileRead {

	public static void main(String[] args) {
		String[] name=  new String[1000];
		String[] number = new String[1000];
		int n = 0; // 사람 숫자
		
		 
		String fileName = "input.txt";
		Scanner inFile;
		try {
			inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) { //Scanner가 input을 더 가지고 있다면 true리턴 [detect End of File]
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(0); //프로그램의 정상적인 종료
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(name[i]+":"+number[i]);
		}

	}

}
