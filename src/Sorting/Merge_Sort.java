package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
//	int[] arr= {5,7,9,1,3,2};

		mergesort(arr);
//	System.out.println("hi");
		System.out.println(Arrays.toString(mergesort(arr)));
		sc.close();
	}

	private static int[] mergesort(int[] arr) {

		int l = 0, r = arr.length - 1, mid = (arr.length - 1) / 2;
		if (l < r) {
			int[] leftArray = new int[mid + 1];
			int[] rightArray = new int[r - mid];

			for (int i = 0; i <=mid; i++) {
				leftArray[i] = arr[i];
			}
			for (int i = 0; i < rightArray.length; i++) {
				rightArray[i] = arr[leftArray.length + i];
			}
			mergesort(leftArray);
			mergesort(rightArray);
			merge(arr, leftArray, rightArray);
		}
		return arr;
	}

	private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
		int i = 0, j = 0, k = 0;
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < leftArray.length) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < rightArray.length) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
