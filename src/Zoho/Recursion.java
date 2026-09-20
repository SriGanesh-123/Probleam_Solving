package Zoho;

import java.util.Scanner;

public class Recursion {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number : ");
	
	int n=sc.nextInt();
	//int i=0;
	System.out.println(fact(n));
}
public static int fact(int i ) {
	
	if(  i==1) {
	return 1;
	}
	
	//System.out.println(i);
	//fact(i-1);

	return i + fact(i-1) ;
}
}
