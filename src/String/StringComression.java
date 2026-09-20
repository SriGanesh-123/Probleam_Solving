package String;

import java.util.Scanner;

public class StringComression {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		String result="";
		int count =1;
		for (int i=1;i<=s.length();i++) {
			if(i<s.length()&&s.charAt(i)==s.charAt(i-1)) {
				count++;
			}else {
				result+=s.charAt(i-1) + "" + String.valueOf(count);
				count=1;
			}
		}
		System.out.println(result);
	}

}
