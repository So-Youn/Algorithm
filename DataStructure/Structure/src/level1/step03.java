package level1;

import java.util.Scanner;

/* 
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
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
