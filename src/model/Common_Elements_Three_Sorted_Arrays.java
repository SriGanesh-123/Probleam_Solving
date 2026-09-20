package model;

import java.util.Arrays;
import java.util.Scanner;

public class Common_Elements_Three_Sorted_Arrays {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Size of Array: ");
	int n=sc.nextInt();
	int[] arr= new int[n];
	System.out.println("Enter the Elements :");
	for (int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the Size of 2'nd Array: ");
	int n1=sc.nextInt();	
	int[] arr1= new int[n1];
	System.out.println("Enter the Elements of 2'nd Array :");
	for (int i=0;i<n1;i++) {
		arr1[i]=sc.nextInt();
	}
	
	System.out.println("Enter the Size of 3'rd Array: ");
	int n2=sc.nextInt();	
	int[] arr2= new int[n2];
	System.out.println("Enter the Elements 3'rd Array :");
	for (int i=0;i<n2;i++) {
		arr2[i]=sc.nextInt();
	}
//    Arrays.sort(arr);
//    Arrays.sort(arr1);
//    Arrays.sort(arr2);
    
    int i = 0, j = 0, k = 0;
    System.out.println("Common Elements:");
    while (i < n && j < n1 && k < n2) {
        if (arr[i] == arr1[j] && arr1[j] == arr2[k]) {
            System.out.print(arr[i] + " ");
            i++;
            j++;
            k++;
        } else if (arr[i] < arr1[j]) {
            i++;
        } else if (arr1[j] < arr2[k]) {
            j++;
        } else {
            k++;
        }
    }
    
    
//    for(int i=0;i<arr.length;i++) {
//    	for( int j=0;j<arr1.length;j++) {
//    		for( int k=0;k<arr2.length;k++) {
//    			if(arr[i]==arr1[j]&&arr1[j]==arr2[k]&&arr2[k]==arr[i])
//    			{
//    				System.out.print( " Common Elements : \n "+ arr[i] + " ");
//    			}
//    		}
//    	}
//    }
    
}
}
