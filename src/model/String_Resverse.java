package model;
import java.util.Scanner;
public class String_Resverse {
	public static void main (String args[]) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the input : ");
		String input = sc.nextLine();
		//int index=0;
		String b="";
		char[]a=input.toCharArray();
		for ( int i=a.length-1;i>=0;i--) {
		  System.out.print(a[i]);
		}	
	}
	}	
}
