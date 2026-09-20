package model;

import java.util.Scanner;

public class Alternate_Sorting {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int size=arr.length;
		int[] min=new int[n/2];
		int minindex=0;
		int[] max=new int[(n/2)+1];
		int maxindex=0;
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for( int a:arr) {
			System.out.println(a);
			}
		for(int i=0;i<min.length;i++) 
		{
		min[minindex]=arr[i];
		minindex++;
		}
		for(int i=0;i<max.length;i++) 
		{
		max[maxindex]=arr[arr.length-i-1];
		maxindex++;
		}
		
		System.out.println("MinmumNumber");
		for( int a:min) {
		System.out.println(a);
		}
		System.out.println("maxNumber");
		for( int a:max) {
			System.out.println(a);
			}
		System.out.println("Output");
		int i=0,j=0;
		while (i<maxindex && j<minindex) {
			System.out.print(max[i++] +" ");
			System.out.print(min[j++] +" ");
		}
		while(i<maxindex) {
			System.out.print(max[i++] +" ");
		}
		while(j<minindex) {
			System.out.print(min[i++] +" ");
		}
//		  int[] result = new int[n];
//	        int minIndex = 0;        // start
//	        int maxIndex = n - 1;    // end
//	        boolean takeMax = true;  // flag to alternate
//	        
//	        // Step 3: Fill result alternately
//	        for (int i = 0; i < n; i++) {
//	            if (takeMax) {
//	                result[i] = arr[maxIndex];
//	                maxIndex--;
//	            } else {
//	                result[i] = arr[minIndex];
//	                minIndex++;
//	            }
//	            takeMax = !takeMax; // toggle between max and min
//	        }
//	        
//	        // Step 4: Print result
//	        for (int num : result) {
//	            System.out.print(num + " ");
//	        }
	}

}
