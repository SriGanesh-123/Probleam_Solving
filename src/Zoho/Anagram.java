package Zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str=sc.nextLine();
	System.out.println("Enter the String 2: ");
	String str1=sc.nextLine();
	str=str.replaceAll("\\s", "").toLowerCase();
	str1=str1.replaceAll("\\s", "").toLowerCase();	
	if(str.length()!=str1.length()) {
		System.out.println("no");
		return;
	}
	char arr[]=str.toCharArray();
	char arr1[]=str1.toCharArray();

	Arrays.sort(arr);
	Arrays.sort(arr1);
	if(Arrays.equals(arr, arr1)) {
		System.out.println("It is a Anagram");
	}
	else {
		System.out.println("It is not  a Anagram");
}
}
}
