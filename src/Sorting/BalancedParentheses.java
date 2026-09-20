package Sorting;
import java.util.Stack;
import java.util.Scanner;

public class BalancedParentheses {

    // Function to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c); // Push opening bracket
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                stack.pop(); // Pop matching opening bracket
            }
            // You can extend this for {} and [] if needed
        }

        return stack.isEmpty(); // True if all brackets matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string containing parentheses:");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
