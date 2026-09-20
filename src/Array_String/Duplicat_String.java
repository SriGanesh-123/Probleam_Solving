package Array_String;

import java.util.Scanner;

public class Duplicat_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size :");
		int n= sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		System.out.println("Enter the string : ");
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextLine();	
		}
//		char[] a=arr[0].toCharArray();
//		for( char a1 : a) {
//			System.out.println(a1);
//		}
		String str2="";
		for(int i=0;i<n;i++) {
			String  a=arr[i].toLowerCase();
			
			for(int j=0;j<a.length();j++) {
				char a1=a.charAt(j);
			if(str2.indexOf(a1)==-1) {
				
				str2+=a1;
					
				
				}
			}
			System.out.print( str2 +"   ");
			str2="";
		}
	}

}
