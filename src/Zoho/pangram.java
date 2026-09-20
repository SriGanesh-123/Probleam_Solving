package Zoho;

import java.util.Scanner;

public class pangram {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter theString  :");
	String  str=sc.nextLine();
	if(pangram(str)) {
		System.out.println("The String is Pangram");
	}else
		System.out.println("The String is not a Pangram");
	
}
private static boolean pangram(String str) {
	str=str.toLowerCase();
	boolean[] present=new boolean[26];
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z') {
			int index=ch -'a';
			present[index]=true;
			
		}
	}
	for( boolean value : present) {
		if(!value) {
			return false;
		}
	}
	return true;
}
}
