package Arrays;

import java.util.Scanner;

public class RotateK {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n= sc.nextInt();
		int[] arr=new int [n];
		System.out.println("Enter the elements : ");
		for(int  i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the K : ");
		int k=sc.nextInt();
		k=k%n;
		for( int  i=0;i<k;i++) {
			int first =arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[n-1]=first;
		}
		for(int i=0;i<n;i++) {
		System.out.print( arr[i] + " ");
		}
	}

}

