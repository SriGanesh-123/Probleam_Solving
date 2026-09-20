package Array_String;

import java.util.Scanner;

public class Palindrome_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int n= sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		System.out.println("Enter the Elements : ");
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		
		System.out.println(palindrome(arr));
				
	}

	private static String palindrome(String[] arr) {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			String a=arr[i].toLowerCase();
			
			if(ispalindrome(a)) {
				result.append(a +"  ");
			}
			
		}
		return result.toString();
	}

	private static boolean ispalindrome(String a) {
		int left=0,right=a.length()-1;
		while(left<right) {
			if(a.charAt(left)!=a.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;	
	}

}
