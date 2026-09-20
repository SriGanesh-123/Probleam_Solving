package model;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Input String : ");
			String a=sc.nextLine().toLowerCase().replaceAll("[^a-z]","");
			char[] b=a.toCharArray();
			int left=0;
			int right=a.length()-1;
			//for(int i=0;i<a.length()-1;i++) {
				if(b[left]==b[right]) {
					
				}
				
						
				
		//	}
			
		}
		
	}

}
