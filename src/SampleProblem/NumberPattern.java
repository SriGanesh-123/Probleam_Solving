package SampleProblem;

import java.util.Scanner;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for n:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int cursor = i;
			int step = n;
			System.out.print(cursor);
			for (int k = 0; k < n - i; k++) {
				cursor += step;
				step--;
				System.out.print(" " + cursor);
			}
			System.out.println();
		}
		sc.close();
	}
}
