package level1;

import java.util.Scanner;

/* 
 * 2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
 * ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
 */
public class step03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result = solution(a,b);
		System.out.println(result);
		sc.close();
	}
	public static String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] year = new String[366];
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int test_day = 0;
        
        for(int i=0; i< year.length; i++){
        	year[i] = day[(i+5)%7];
        }

        for(int i=0; i<a-1; i++) {
        	test_day +=month[i];
        }
        test_day += b-1;
        answer = year[test_day];
        return answer;
    }
}
