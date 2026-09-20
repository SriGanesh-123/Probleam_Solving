package model;

import java.util.Scanner;

public class String_Manipulation {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		String s="";
		String r="";
		System.out.println("Enter the String :");
		s=sc.nextLine();
		//char[] a =s.toCharArray();
		for (int i =s.length()-1;i>=0;i--) {
			r += s.charAt(i);
			
		}
		if(r.equals(s))
		{
			System.out.println("Palindrome ");
		}
		else
			System.out.println(" Not Palindrome ");
		
		
		System.out.println("Reverse : "+r);
	}
}
}
