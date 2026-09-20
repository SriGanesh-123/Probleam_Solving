package model;

import java.util.Scanner;

public class Leader_Array {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Array Size : ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int size=arr.length;
	System.out.println("Enter elements : ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		
	}
	int temp=0;
	for(int i=0;i<size;i++) {
		// int max=arr[i];
		int j=0;
		for ( j=i+1;j<size;j++) {
			if(arr[i] <= arr[j])
			break;
		}
		 if (j == n) { // If loop ran till the end → leader
             System.out.print(arr[i] + " ");
         }
	}
	//char[] temp;
	
}
}
