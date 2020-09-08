package method.Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// �簢���� ũ�Ⱑ ���� ������� �����ϱ�
public class Code03 {
	static MyRectangle[] rects = new MyRectangle[100]; //�簢���� �ټ��̴�
	static int n = 0;
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while(in.hasNext()) {
				//���� ���� ����
				rects[n] = new MyRectangle();
				rects[n].lu = new MyPoint();
				
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt(); //�� ��ü�� ������ ������Ƽ�� Ÿ���̴� ���� ���������� �ʾƵ� �ȴ�.
				rects[n].height = in.nextInt();
				n++;
			}
			in.close();
			bubbleSort();
			for (int i = 0; i < n; i++) { 
				System.out.println(rects[i].lu.x+" "+rects[i].lu.y+" "+ rects[i].width+" "+rects[i].height);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
		}
		
	}

	private static void bubbleSort() {
		for (int i = n-1; i>0;i--) {
			for( int j=0; j<i; j++) {
				if ( calcArea(rects[j])> calcArea(rects[j+1])) {
					MyRectangle tmp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
	}
	
	public static int calcArea( MyRectangle r) {
		return r.width * r.height;
	}

}
