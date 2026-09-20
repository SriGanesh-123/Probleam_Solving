package Task;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortFile {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size : ");
	int n=sc.nextInt();
	int[] arr=new int [n];
	System.out.println("Enter the Elements : ");
	for( int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
//	mergesort(arr);
	System.out.println(Arrays.toString(mergesort(arr)));
}

private static int[] mergesort(int[] arr) {
	int l=0,r=arr.length-1,mid=(arr.length-1)/2;
	if(l<r) {
		int[] lArray=new int[mid+1];
		int[] rArray=new int[r-mid];
		
		for(int i=0;i<lArray.length;i++) {
			lArray[i]=arr[i];
		}
		for(int i=0;i<rArray.length;i++) {
			rArray[i]=arr[lArray.length+i];
		}
		mergesort(lArray);
		mergesort(rArray);
		merge(arr,lArray,rArray);
	}
	return arr;
}

private static void merge(int[] arr, int[] lArray, int[] rArray) {
	int i=0,j=0,k=0;
	while(i<lArray.length&&j<rArray.length) {
		if(lArray[i]<rArray[j]) {
			arr[k]=lArray[i];
			i++;
		}else {
			arr[k]=rArray[j];
			j++;
		}
		k++;
	}
	while(i<lArray.length) {
		arr[k]=lArray[i];
		k++;
		i++;
	}
	while(j<rArray.length) {
		arr[k]=rArray[j];
		k++;
		j++;
	}
}
}
