package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuchNationalFlag {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	int[] arr = {0, 1, 2, 0, 1, 2};
	sort(arr);
	System.out.println(Arrays.toString(arr));
}

private static void sort(int[] arr) {
	int low=0,mid=0,high=arr.length-1;
	while(mid<=high) {
		if(arr[mid]==0) {
			int temp=arr[low];
			arr[low]=arr[mid];
			arr[mid]=temp;
			mid++;
			low++;
			
		}else if(arr[mid]==1){
			mid++;
		}else 
		{
			int temp=arr[high];
			arr[high]=arr[mid];
			arr[mid]=temp;
			high--;
		}
	}
 
	
}
}
