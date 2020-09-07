package method.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * file ���� �� ����ϱ�
 */
public class FileRead_plus {
	
	//�Լ����� �Ű������� �޾Ƽ� ���� �ʱ� ���� static 
	static String[] name=  new String[1000];
	static String[] number = new String[1000];
	static int n = 0; // ��� ����
	
	public static void main(String[] args) {
		 
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
		//�̸��� ���ĺ� ������ ����
		bubbleSort();
		
		for(int i=0; i<n; i++) {
			System.out.println(name[i]+" : "+number[i]);
		}

	}

	public static void bubbleSort() {
		for(int i =n-1; i>0 ; i--) {
			for(int j=0;j<i;j++) {
				if(name[j].compareTo(name[j+1]) > 0) { //String �� - compareTo ? `>`�̸� ��� ��ȯ
					//swap name[j] and name[j+1]
					//�̸� , ��ȭ��ȣ�� �� �� �ٲپ� �־�� �Ѵ�.
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
