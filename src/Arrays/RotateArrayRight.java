package Arrays;

import java.util.Scanner;

public class RotateArrayRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter k :");
		int k = sc.nextInt();
		k = k % n; // to avoid extra rotations
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[(i + k) % n] = arr[i];
		}
		for (int i = 0; i < n; i++)
			System.out.print(temp[i] + " ");
	}
}

