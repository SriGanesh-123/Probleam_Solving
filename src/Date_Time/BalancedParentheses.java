package Date_Time;

import java.util.Stack;
import java.util.Scanner;

public class BalancedParentheses {
	public static void main(String[] args) {
		System.out.println("Enter ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '(')
				stack.push(c);
			else if (c == ')') {
				if (stack.isEmpty()) {
					System.out.println("Not Balanced");
					return;
				}
				stack.pop();
			}
		}
		System.out.println(stack.isEmpty() ? "Balanced" : "Not Balanced");
	}
}