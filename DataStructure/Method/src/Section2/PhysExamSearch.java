package Section2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhysData[] x = { 
				new PhysData("윤소윤", 164, 1.0),
				new PhysData("유지민", 186, 0.8),
				new PhysData("유지훈", 168, 0.4),
				new PhysData("이준기", 175, 1.0),
				new PhysData("박보검", 183, 0.7),
		};
		System.out.println("몇 cm인 사람을 찾고있나요?");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(
				x,
				new PhysData("", height, 0.0),
				PhysData.HEIGHT_ORDER
				);
		
		if(idx <0) System.out.println("요소가 없습니다.");
		else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터 : "+ x[idx]);
		}
		sc.close();
		
	}
	static class PhysData{
		private String name;
		private int height;
		private double vision;
		
		public PhysData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return "PhysData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}
		
		//오름차순 정렬
		public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhysData>{
			public int compare(PhysData d1, PhysData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height<d2.height) ? -1 : 0;
			}
		}
		
	}
}
