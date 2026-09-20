package model;

import java.util.Scanner;

public class Count_Inversions {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n=sc.nextInt();		
		int[] arr= new int[n];
		int size=arr.length;
		System.out.println("Enter the Elements :");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int inversioncount=0;
		for(int i=0;i<size;i++) {
			for( int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					inversioncount++;
				}
			}
		}
		
		System.out.println("Inversioncount"+inversioncount);
	}

}
