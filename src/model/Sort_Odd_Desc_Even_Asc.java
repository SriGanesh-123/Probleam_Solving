package model;

import java.util.Scanner;

public class Sort_Odd_Desc_Even_Asc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of Array : ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int ass[]=new int[n/2];
	int dec[]=new int[(n/2)+1];
	System.out.println("Enter the Eleements of Array : ");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1;j++) {
			if(arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	for(int i=0;i<ass.length;i++) {
		ass[i]=arr[i];
	}
//	System.out.println("Assending");
//	for(int i : ass ) {
//		System.out.print(i+ " ");
//	}
	for(int i=0;i<dec.length;i++) {
		dec[i]=arr[arr.length-i-1];
	}
//	System.out.println("Decending");
//	for(int i : dec ) {
//		System.out.print(i+ " ");
//	}
	int i=0,j=0;
	while(i<dec.length && j<ass.length) {
		System.out.print(dec[i++] + " ");
		System.out.print(ass[j++] + " ");
	}
	
//	for(int i=0;i<n;i++) {
//		arr[i]=sc.nextInt();
//	}
	
	
}
}
