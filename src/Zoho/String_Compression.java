package Zoho;

import java.util.Scanner;

public class String_Compression {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String : ");
			String str = sc.nextLine();
			String compression = comp(str);
			System.out.println(compression);
		}
	}

	public static String comp(String s) {
		if (s == null || s.length() == 0)
			return "";
		int count = 1;
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= s.length(); i++) {
			if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				result.append(s.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		return result.toString();
	}

}
