package Arrays;

import java.util.Scanner;

public class Second_Largest_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        if(arr.length==0) {
        	System.out.println("Array is empty ");
        }
		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}

		System.out.println(second);
	}
}
