package model;

import java.util.Scanner;

public class SortArray {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the Elements :");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int size=arr.length;
		for (int i=0;i<size;i++) {
			for (int j=0;j<size-i-1;j++) {
				
		
			if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		}
		for(int b : arr)
		System.out.println(b);
	}

}
