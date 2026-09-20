package model;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Size of row in Array1: ");
		int r=sc.nextInt();
		System.out.println("Enter the Size of column in  Array1: ");
		int c=sc.nextInt();
		int[][] arr= new int[r][c];
		System.out.println("Enter the Elements :");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Size of row in Array1: ");
		int r1=sc.nextInt();
		System.out.println("Enter the Size of column in  Array1: ");
		int c1=sc.nextInt();
		int[][] arr1= new int[r1][c1];
		System.out.println("Enter the Elements :");
		for (int i1 =0;i1<r1;i1++) {
			for(int j1 =0;j1<c1;j1++) {
				arr1[i1][j1] =sc.nextInt();
			}
		}
		
		System.out.println("Matrix 1");
		for(int[] a : arr){
			for(int b : a) {
				
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println("Matrix 2");
		for(int[] a : arr1){
			for(int b : a) {
				
				System.out.print(b);
			}
			System.out.println();
		}
		
		
		if(r!=c1) {
			System.out.println("Matrix Multiplicaton not Possible...!");
		}
		
		int[][] result=new int[r][c1];	
		for (int i=0;i<r;i++) {
			for(int j=0;j<c1;j++) {
				for ( int k=0;k<c;k++) {
				result[i][j]+=arr[i][k]*arr1[k][j];
				}
			}
		}
		
		  System.out.println("Resultant Matrix:");
	        for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c1; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
//		for (int[] row : result) {
//		    for (int val : row) {
//		        System.out.print(val + " ");
//		    }
//		    System.out.println();
//		}
	}
}
}
