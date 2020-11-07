package level1;

import java.util.*;

public class PhoneBook {
	public static void main(String[] args) {
		// String[] phone_book = new String[] {"119", "97674223", "1195524421"};
		// String[] phone_book = new String[] {"123","456","789"};
		String[] phone_book = new String[] { "12", "123", "1235", "567", "88" };
		boolean result = solution(phone_book);
		System.out.println(result);

	}

	public static boolean solution(String[] phone_book) {
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				if (phone_book[i].startsWith(phone_book[j]))
					return false;
				if (phone_book[j].startsWith(phone_book[i]))
					return false;
			}
		}
		return true;
	}
}
