package Task;

import java.util.Scanner;

public class DistinctSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		substring(str);
	}




	private static void substring(String str) {
		if (str == null || str.length() < 2) {
			System.out.println("No substring");

		}
		char[] arr=str.toCharArray();
		String str2="";

		        for(int i=0;i<str.length();i++){
		            char c=str.charAt(i);
		            if(str2.indexOf(c)==-1){   
		                str2+=c;
		            }
		        }

		        System.out.println(str2);

		String str3 = "";

		for (int i = 1; i < str.length(); i++) {
		   while (str.charAt(i) != str.charAt(i - 1) ) {
			str3+=str.charAt(i-1);
			if(str3.length() != str2.length()) {
				str3="";
			}
			}
			
		}
	System.out.println(str3);
	
	}
}

