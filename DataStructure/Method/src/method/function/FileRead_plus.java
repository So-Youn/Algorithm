package method.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * file 읽은 후 출력하기
 */
public class FileRead_plus {
	
	//함수에서 매개변수로 받아서 하지 않기 위해 static 
	static String[] name=  new String[1000];
	static String[] number = new String[1000];
	static int n = 0; // 사람 숫자
	
	public static void main(String[] args) {
		 
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
		//이름을 알파벳 순으로 정렬
		bubbleSort();
		
		for(int i=0; i<n; i++) {
			System.out.println(name[i]+" : "+number[i]);
		}

	}

	public static void bubbleSort() {
		for(int i =n-1; i>0 ; i--) {
			for(int j=0;j<i;j++) {
				if(name[j].compareTo(name[j+1]) > 0) { //String 비교 - compareTo ? `>`이면 양수 반환
					//swap name[j] and name[j+1]
					//이름 , 전화번호를 둘 다 바꾸어 주어야 한다.
					String temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;
					
					String numberTemp = number[j];
					number[j] = number[j+1];
					number[j+1] = numberTemp;
				}
			}
		}
	}
	

}
