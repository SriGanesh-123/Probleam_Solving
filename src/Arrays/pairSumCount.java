package Arrays;

import java.util.Scanner;

public class pairSumCount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n= sc.nextInt();
		int[] arr=new int [n];
		System.out.println("Enter the elementrs : ");
		for ( int i=0;i<n ;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the ttarget sum : ");
		int sum=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		
	}

}
