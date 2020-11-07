package level1;

import java.util.*;

public class PhoneBook_2 {
	public static void main(String[] args){
		//String[] phone_book = new String[] {"119", "97674223", "1195524421"};
		//String[] phone_book = new String[] {"123","456","789"};
		String[] phone_book = new String[] {"12","123","1235","567","88"};
		boolean result = solution(phone_book);
		System.out.println(result);
		
	}
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=1;i<phone_book.length;i++){
            if(phone_book[i].startsWith(phone_book[0])) answer = false;
        }
        return answer;
    }
}
