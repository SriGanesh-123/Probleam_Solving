package Zoho;

import java.util.Scanner;

public class Reverse_word_Recursion {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the string : ");
		String input=sc.nextLine();
		String str1=input.trim();
		// System.out.println(str1.indexOf('r'));
		
		System.out.println(str1);
		System.out.println("Reversed String : " + reverseWord(input));
	}

}
public static String reverseWord(String str) {
	str=str.trim();
	int spaceindex = str.indexOf(' ');
	if(spaceindex == -1) {
		return str;
	}
	String firstword=str.substring(0,spaceindex);
	String rest=str.substring(spaceindex+1);
	return reverseWord(rest) + " " +firstword;
}
}
