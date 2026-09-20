//package Arrays;
//
//import java.util.Scanner;
//
//public class MissingNumber {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size : ");
//		int n=sc.nextInt();
//		int[] arr3=new int [n-1];
//		System.out.println("Enter the elements");
//		for(int i=0;i<n-1;i++) {
//			arr3[i]=sc.nextInt();
//		}
//		int[] arr= {1,2,0};
//		int[] arr1= {1,2,4};
//		int[] arr2= {};
//
//		System.out.println(missingnumber(arr));
//		System.out.println(missingnumber(arr1));
//		System.out.println(missingnumber(arr2));
//		System.out.println(missingnumber(arr3));
//		}
//
//	private static int  missingnumber(int[] arr) {
//		int n=arr.length;
//		if(n==0) return 0;
//		int total=n*(n+1)/2;
//		for( int i:arr) {
//			total -= i;
//		}
//		return total;
//	}
//	}

//package ArrayTask;
//import java.util.Scanner;
//
//public class MissingNumber {
//	public static void main(String args[]) {
//	int[] arr= {1,2,3,4,5,6,7,8,10};
//	long n=arr.length+1L;
//	long sum=0;
//	for(int num:arr)sum+=num;
//	long result=n*(n+1)/2;
//	System.out.println(result-sum);
//	}
//}
package Arrays;

import java.util.Scanner;

public class MissingNumberSumFormula { 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the soze : ");
       int n = sc.nextInt(); // N value 
       int[] arr = new int[n - 1]; 
       int sum = 0; 

       for (int i = 0; i < n - 1; i++) { 
           arr[i] = sc.nextInt(); 
           sum += arr[i]; 
       } 

       int totalSum = n * (n + 1) / 2; 
       int missing = totalSum - sum; 

       System.out.println(missing); 
   } 
}
