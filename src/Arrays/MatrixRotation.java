package Arrays;

import java.util.Scanner;

public class MatrixRotation {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the matrix size : ");
	int n=sc.nextInt();
	
	int[][] arr= new int[n][n];
	System.out.println("Enter the Elements :");
	for (int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	
	System.out.println("hello");
	for(int i=0;i<n;i++) {
		for( int j=i;j<n;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	
	System.out.println("hello");
	for(int i=0;i<n;i++) {
		int l=0,r=n-1;
		while(l<r) {
			int temp=arr[i][l];
			arr[i][l]=arr[i][r];
			arr[i][r]=temp;
			l++;
			r--;
		}
	}
	System.out.println("hello");
	
	for(int i=0;i<n;i++) {
		for( int j=0;j<n;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
}
