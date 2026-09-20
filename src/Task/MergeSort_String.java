
package Task;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size : ");
//		int n = sc.nextInt();
//		sc.nextLine();
//		String[] arr = new String[n];
//		System.out.println("Enter the Elements in String : ");
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextLine();
//		}

		String[] arr = {"War and Peace", "The Alchemist", "1984", "Sapiens", "Hamlet"};

//	mergesort(arr);
		System.out.println(Arrays.toString(mergesort(arr)));
	}

	private static String[] mergesort(String[] arr) {
		int l = 0, r = arr.length - 1, mid = (arr.length - 1) / 2;
		if (l < r) {
			String[] lArray = new String[mid + 1];
			String[] rArray = new String[r - mid];

			for (int i = 0; i < lArray.length; i++) {
				lArray[i] = arr[i];
			}
			for (int i = 0; i < rArray.length; i++) {
				rArray[i] = arr[lArray.length + i];
			}
			mergesort(lArray);
			mergesort(rArray);
			merge(arr, lArray, rArray);
		}
		return arr;
	}

	private static void merge(String[] arr, String[] lArray, String[] rArray) {
		int i = 0, j = 0, k = 0;
		while (i < lArray.length && j < rArray.length) {
			if (lArray[i].compareTo(rArray[j])<0) {
				arr[k] = lArray[i];
				i++;
			} else {
				arr[k] = rArray[j];
				j++;
			}
			k++;
		}
		while (i < lArray.length) {
			arr[k] = lArray[i];
			k++;
			i++;
		}
		while (j < rArray.length) {
			arr[k] = rArray[j];
			k++;
			j++;
		}
	}
}
