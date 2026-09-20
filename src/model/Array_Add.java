package model;
import java.util.Scanner;
public class Array_Add {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array1 : ");
		int n=sc.nextInt();
		int[] arr1= new int[n];
		System.out.println("Enter the " + n +" in array : ");
		for (int i=0;i<n;i++) {
		arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of Array2 : ");
		int n2=sc.nextInt();
		int[] arr2= new int[n2];
		System.out.println("Enter the" +n2 +" in array : ");
		for (int i=0;i<n2;i++) {
		arr2[i]=sc.nextInt();
		}
		
		int[] c= new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			c[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			c[arr1.length+i]=arr2[i];
		}
		
		for (int i=0;i<c.length-1;i++) {
			if(c[i]<c[i+1]) {
			int temp=c[i];	
			c[i]=c[i+1];
			c[i+1]=temp;
			i=-1;
		}
	}
		System.out.println("Merging arr1+arr2 : ");
		for (int d :c) {
			
		System.out.println(d);
	}
		
	}
}

