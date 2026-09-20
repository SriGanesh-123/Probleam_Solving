package Arrays;

import java.util.Scanner;

public class Max_Sum_Contiguous_Subarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of Array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxsum=0,cursum=0;
		int start=0,end=0,tempstart=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>=0){
				cursum+=arr[i];
				if(cursum > maxsum) {
					maxsum=cursum;
					start=tempstart;
					end=i;
				}
			}else {
				cursum=0;
				tempstart=i+1;
			}
		}
		System.out.println("max sum : " +maxsum);
		System.out.println("Subarray  : ");
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]  +" ");
		}
	}

}
