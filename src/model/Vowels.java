package model;

import java.util.Scanner;

public class Vowels {
	
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		String str=input.toLowerCase();
		int count=0;
		int  Consonants_count=0;
		System.out.print("Vowels : " + " ");
		for (int i=0;i<input.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				System.out.print(ch +"  ");
				count++;
			}
			else {
				 Consonants_count++;
			}
		
			
	
		}
		System.out.println();
		System.out.println("Vowels_Count "+count + "  ");
		System.out.println(" \nConsonants_count"+Consonants_count + "  ");

	}
}
}
