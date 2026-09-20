package Number;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is NOT an Armstrong number.");
		}
	}

	public static boolean isArmstrong(int num) {
		int original = num;
		int n = String.valueOf(num).length(); // number of digits
		int sum = 0;

		while (num > 0) {
			int digit = num % 10; // extract last digit
			sum += Math.pow(digit, n); // raise digit^n and add to sum
			num /= 10; // remove last digit
		}

		return sum == original; // Armstrong check
	}
}

/*
 * public class ArmstrongRecursive { public static void main(String[] args) {
 * int num = 9474;
 * 
 * int n = String.valueOf(num).length(); if (num == armstrongSum(num, n)) {
 * System.out.println(num + " is an Armstrong number."); } else {
 * System.out.println(num + " is NOT an Armstrong number."); } }
 * 
 * // recursive function to calculate Armstrong sum public static int
 * armstrongSum(int num, int power) { if (num == 0) return 0; // base case int
 * digit = num % 10; // extract last digit return (int) Math.pow(digit, power)
 * // digit^power + armstrongSum(num / 10, power); // recursive call } }
 */
