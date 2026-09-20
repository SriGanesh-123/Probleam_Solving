package Arrays;

import java.util.Scanner;

public class FrequencyArray {
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the size : ");
//		int  n= sc.nextInt();
//		int[] arr= new int [n];
//		System.out.println("Enter the elements : ");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		boolean[] visited= new boolean [n];
//		for( int i=0;i<n;i++) {
//			if(visited[i]) continue;
//			int count=1;
//			for( int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					visited[i]=true;
//					count++;
//				}
//			}
//			System.out.println(arr[i] + " :  "+count);
//		}
//	}
//
//}
//

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
				System.out.println(a1[i-1]+ " : "+count );
				count=1;
			}
			
		}
		System.out.println(a1[a1.length-1]+" : "+count);
		
		

		
	}
}
}




