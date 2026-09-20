package String;

import java.util.Scanner;

public class Reverse_word_Recursion {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the string : ");
		String input=sc.nextLine();
		String str1=input.trim();
		 System.out.println(str1.indexOf('r'));
		
		System.out.println(str1);
		System.out.println("Reversed String : " + reverseWord(input));
	}

}
public static String reverseWord(String str) {
	str=str.trim();
	int spaceindex = str.indexOf(' ');
	if(spaceindex == -1) {
		return str;
	}
	String firstword=str.substring(0,spaceindex);
	String rest=str.substring(spaceindex+1);
	return reverseWord(rest) + " " +firstword;
}
}
/*
import java.util.Scanner; 
public class ReverseWords { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
String s = sc.nextLine(); 
// Split words manually 
int n = s.length(); 
String[] words = new String[100]; 
int wCount = 0; 
String temp = ""; 
         
        for (int i = 0; i < n; i++) { 
            char c = s.charAt(i); 
            if (c == ' ') { 
                words[wCount++] = temp; 
                temp = ""; 
            } else { 
                temp += c; 
            } 
        } 
        words[wCount++] = temp;  // last word 
 
        // Print in reverse 
        for (int i = wCount - 1; i >= 0; i--) { 
            System.out.print(words[i]); 
            if (i != 0) System.out.print(" "); 
        } 
    } 
} 
*/