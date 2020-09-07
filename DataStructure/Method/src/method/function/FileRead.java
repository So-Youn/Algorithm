package method.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * file ���� �� ����ϱ�
 */
public class FileRead {

	public static void main(String[] args) {
		String[] name=  new String[1000];
		String[] number = new String[1000];
		int n = 0; // ��� ����
		
		 
		String fileName = "input.txt";
		Scanner inFile;
		try {
			inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) { //Scanner�� input�� �� ������ �ִٸ� true���� [detect End of File]
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(0); //���α׷��� �������� ����
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(name[i]+":"+number[i]);
		}

	}

}
