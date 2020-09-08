package method.Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// 사각형의 크기가 작은 순서대로 정렬하기
public class Code03 {
	static MyRectangle[] rects = new MyRectangle[100]; //사각형이 다수이니
	static int n = 0;
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while(in.hasNext()) {
				//참조 변수 선언
				rects[n] = new MyRectangle();
				rects[n].lu = new MyPoint();
				
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt(); //그 자체가 정수형 프리미티브 타입이니 따로 생성해주지 않아도 된다.
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
