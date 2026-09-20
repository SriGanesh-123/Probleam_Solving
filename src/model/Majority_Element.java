package model;

import java.util.Scanner;

public class Majority_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array1 : ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the " + n + " in array : ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int candidate = arr1[0];
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (arr1[i] == candidate) {
				count++;
			} else
				
			{
				count--;
				if (count == 0) {
					candidate = arr1[i];
					count = 1;
				}

			}
		}
		count=0;
		for(int num :arr1) {
			if(num==candidate) {
				count++;
			}
		}
		if (count > n / 2) {
            System.out.println(candidate);
        } else {
            System.out.println("None");
	}

}
}
