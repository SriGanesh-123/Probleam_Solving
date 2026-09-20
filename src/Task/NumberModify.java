package Task;

import java.util.Arrays;
import java.util.Scanner;

public class NumberModify {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		String num=sc.nextLine();
		char[] arr=num.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>arr.length-2;i--) {
			if(arr[i]> arr[i-1]) {
				char temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
				System.out.println(Arrays.toString(arr));
						
		}
				else {
				num="-1";
				System.out.println(num);
			}
			
		}
			
		
		
	}

}
