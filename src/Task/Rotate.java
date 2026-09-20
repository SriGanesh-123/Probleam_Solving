package Task;

import java.util.Scanner;

public class Rotate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of Array : ");
	int n= sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter elements : ");
	for (int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	}
	System.out.println("Enter the k : ");
	int k=sc.nextInt();
	
	for (int i=0;i<k;i++) {
		int temp=arr[arr.length-1];
		for(int j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
			
		}
		arr[0]=temp;
	}
	for (int d : arr) {
		System.out.print(+d+ " ");
	}

}
}













