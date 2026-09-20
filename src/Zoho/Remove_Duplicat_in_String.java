package Zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicat_in_String {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter t he String : ");
	String str=sc.nextLine();	
	str=str.replaceAll("\\s", "").toLowerCase();
	char[] arr=str.toCharArray();
	String str2="";

	        for(int i=0;i<str.length();i++){
	            char c=str.charAt(i);
	            if(str2.indexOf(c)==-1){   // if not already in result
	                str2+=c;
	            }
	        }

	        System.out.println(str2);
	    
}
}
	
//	
//	
//		for(int j=0;j<=arr.length-1;j++) {
//			if(arr[j]!=arr[j+1]) {
//				str2+=arr[j];
//				//index++;
//			}
//		}
//	
//	
//	System.out.println(str2);

	

//    for (int i = 0; i < arr.length; i++) {
//        boolean duplicate = false;
//        // Check if character already exists in result
//        for (int j = 0; j < result.length(); j++) {
//            if (arr[i] == result.charAt(j)) {
//                duplicate = true;
//                break;
//            }
//        }
//        if (!duplicate) {
//            result += arr[i]; // add only if not duplicate
//        }
//    }
//
//    System.out.println(result);

