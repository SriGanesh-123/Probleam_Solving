package model;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parentheses {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		sc.close();
		if (balance(input)) {
			System.out.println("Balanced ");
		} else {
			System.out.println(" Not Balanced ");
		}
	}

	private static boolean balance(String str) {
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '(' || c == '{' || c == ']') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}
//char[] a=input.toCharArray();

//String str="";
//
//for(int i=0;i<a.length;i++) {
//	if(a[i]== '{' || a[i]=='}'||a[i]== '(' || a[i]==')'||a[i]== '[' || a[i]==']') {
//		str+=a[i];
//		
//	}
//	
//}
//if(palindrome(str)) {
//	System.out.println("Balanced ");
//}
//else {
//	System.out.println("Not Balanced ");
//	
//}

//char[] b=str.toCharArray();
//for( int j=0;j<b.length;j++) {
//for(int i=b.length;i>=0;i--) {
//	if(b[i]==b[j]) {
//		
//	}
//}
//}
//System.out.println(Arrays.toString(b));
}