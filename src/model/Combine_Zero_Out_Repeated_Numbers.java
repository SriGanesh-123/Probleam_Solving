package model;

import java.util.Scanner;

public class Combine_Zero_Out_Repeated_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int  size=arr.length;
		System.out.println("Enter the elements in array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before adding ");
		for (int i = 0; i < size-1; i++) {
			
				if (arr[i]!=0 && arr[i] == arr[i + 1]) {
					arr[i] = arr[i] + arr[i + 1];
					arr[i+1]=0;
				}
			
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-1; j++) {
				if (arr[j] == 0) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After adding ");

		for (int i : arr) {
			System.out.print( i + " ");
		}

	}
}
