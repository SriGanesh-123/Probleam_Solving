package Arrays;

import java.util.Scanner;

public class LeaderInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int max=arr[n-1];
		System.out.print(max + " ");
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.print(max+ " ");
			}
		}
		
	}

}
