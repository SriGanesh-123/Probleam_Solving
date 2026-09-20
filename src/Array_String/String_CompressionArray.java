package Array_String;

import java.util.Scanner;

public class String_CompressionArray {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Size :");
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String [n];
		System.out.println("Enter the string :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		System.out.println(compression(arr));
	}
}

private static String compression(String[] arr) {
	StringBuilder result=new StringBuilder();
	

	for( int i=0;i<arr.length;i++) {
		String a=arr[i].toLowerCase();
		int count=1;
		if(a==null||a.length()==0) {
			return "";
		}
		for(int j=1;j<=a.length();j++) {
			if(j<a.length()&&a.charAt(j)==a.charAt(j-1)) {
				count++;
			}else {
				result.append(a.charAt(j-1)).append(count );
				count=1;
			}
		}
	}
   
	return result.toString();
}
}
