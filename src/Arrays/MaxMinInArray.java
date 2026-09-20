package Arrays;

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is both min and max
        int max = arr[0];
        int min = arr[0];

        // Traverse the array to find max & min
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max
            }
            if (arr[i] < min) {
                min = arr[i]; // update min
            }
        }

        // Output
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}
