package model;

import java.util.Scanner;

public class MatrixAddition {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Size of Array: ");
		int n=sc.nextInt();
		
		int[][] arr= new int[n][n];
		System.out.println("Enter the Elements :");
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Size of  2nd Array: ");
		int n1=sc.nextInt();
		
		int[][] arr1= new int[n1][n1];
		System.out.println("Enter the  Elements of 2nd Array :");
		for (int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		int[][] result=new int[n1][n1];	
		for (int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				result[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		for (int[] row : result) {
		    for (int val : row) {
		        System.out.print(val + " ");
		    }
		    System.out.println();
		}
	}
}
}
