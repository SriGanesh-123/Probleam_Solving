package model;

import java.util.Scanner;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size of Array: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the Elements :");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the K value : ");
			int k = sc.nextInt();
			for (int i = 0; i <= n - k; i++) {
				int max = arr[i];
				for (int j = 1; j < k; j++) {
					if (arr[j + i] > max) {
						max = arr[j + i];
					}
				}
				System.out.print(max + " ");
			}
		}
	}
}