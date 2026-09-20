package model;
import java.util.Scanner;
public class Frequency_Array {
public static void main(String args[]) {
	try (Scanner sc = new Scanner(System.in)) {
		int[] a1= {10,20,10,30,10,20,30};
		//System.out.println("Ente the input : ");
		//int a=sc.nextInt();
		//sc.nextLine();
		int[] a2 = new int[a1.length];
		//int count=0;
		//int e=a1.length;
		System.out.println("before swap");
		for(int num1 : a1) {
			System.out.println(" "+num1);
			}
	
	//	System.out.println(arr1[6]);
		for (int i=0;i<a1.length-1;i++) {
			if(a1[i]>a1[i+1]) {
				int temp=a1[i];
				a1[i]=a1[i+1];
				a1[i+1]=temp;
				i=-1;
			}
		}
		int count=1;
		for(int i=1;i<=a1.length-1;i++) {
			if(a1[i]==a1[i-1]) {
				count++;
			}else {
				System.out.println(a1[i-1]+ " "+count );
				count=1;
			}
			
		}
		System.out.println(a1[a1.length-1]+" = "+count);
		
		
//		System.out.println("after swap");
//		for(int d : a1) {
//			System.out.println(" "+d);
//			}
//		int index=0;
//		for(int i=0;i<a1.length-1;i++) {
//			
//			if(a1[i]==a1[i+1]) {
//				a2[index]=a1[i];
//			index++;
//			
//			}
//		}
//		System.out.println("\n\nhi\n\n");
//		for(int d : a2) {
//			System.out.println(d);
//			}
		
	}
}
}
