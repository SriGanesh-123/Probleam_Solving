package String;

import java.util.Scanner; 

public class AnagramCheck { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the string 1 : ");
        String s1 = sc.nextLine(); 
        System.out.println("Enter the string 2 : ");
        String s2 = sc.nextLine(); 
 
        if (s1.length() != s2.length()) { 
            System.out.println("No"); 
            return; 
        } 
 
        int[] freq = new int[26]; 
        for (int i = 0; i < s1.length(); i++) { 
            freq[s1.charAt(i) - 'a']++; 
            freq[s2.charAt(i) - 'a']--; 
        } 
 
        for (int val : freq) { 
            if (val != 0) { 
                System.out.println("No"); 
                return; 
            } 
        } 
        System.out.println("Yes"); 
    } 
}

/*
| Character        | ASCII Value |
| ---------------- | ----------- |
| `'A'`            | 65          |
| `'B'`            | 66          |
| `'Z'`            | 90          |
| `'a'`            | 97          |
| `'b'`            | 98          |
| `'z'`            | 122         |
| `'0'`            | 48          |
| `'9'`            | 57          |
| `' '` (space)    | 32          |
| `'\n'` (newline) | 10          |


*/