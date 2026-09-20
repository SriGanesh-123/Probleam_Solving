package Zoho;

import java.util.Scanner;

public class Reverse_Characters_Without_Moving_Punctuation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String a = sc.nextLine();
		char[] arr = a.toCharArray();
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (!ischar(arr[left])) {
				left++;
			} else if (!ischar(arr[right])) {
				right--;
			} else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println("output : " + new String(arr));
	}

	public static boolean ischar(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
	}
}