package Number;

import java.util.Scanner;

public class AnagramNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the number : ");
	int n= sc.nextInt();
	System.out.println("Enter the number : ");
	int n1= sc.nextInt();
	if(anagram(n,n1)) {
		System.out.println(" anagram");
	} else {
		System.out.println("not  Anagram");
	}
}

private static boolean anagram(int n,int n1) {
	String s1=String.valueOf(n);
	String s2=String.valueOf(n1);
	if(s1.length()!=s2.length())
		
		return false;
		
	int[] count=new int[10];
	
	for( char c: s1.toCharArray()) {
		count[c -'0']++;
	}
	
	for( char c: s2.toCharArray()) {
		count[c -'0']--;
		
	}
	for( int c: count) {
		if(c!=0)
		return false;
	}
	return true;
	}

}




