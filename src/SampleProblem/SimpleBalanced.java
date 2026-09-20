package SampleProblem;

//public class RemoveUnbalanced {
//    public static String removeInvalidParentheses(String s) {
//        // Step 1: Remove extra ')'
//        StringBuilder sb = new StringBuilder();
//        int open = 0;
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                open++;
//                sb.append(c);
//            } else if (c == ')') {
//                if (open > 0) { // valid ')'
//                    open--;
//                    sb.append(c);
//                }
//                // else skip extra ')'
//            } else {
//                sb.append(c); // keep letters/numbers
//            }
//        }
//
//        // Step 2: Remove extra '(' (from right side)
//        StringBuilder result = new StringBuilder();
//        int toRemove = open; // remaining unmatched '('
//        for (int i = sb.length() - 1; i >= 0; i--) {
//            char c = sb.charAt(i);
//            if (c == '(' && toRemove > 0) {
//                toRemove--; // skip this '('
//            } else {
//                result.append(c);
//            }
//        }
//
//        return result.reverse().toString(); // reverse back
//    }
//
//    public static void main(String[] args) {
//        System.out.println(removeInvalidParentheses("a)b(c)d"));   // ab(c)d
//        System.out.println(removeInvalidParentheses("((a+b))("));  // ((a+b))
//        System.out.println(removeInvalidParentheses("(a+b)*(c+d)"));// (a+b)*(c+d)
//    }
//}
import java.util.Stack;
import java.util.Scanner;

public class SimpleBalanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        int start = -1, end = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('||c=='{'||c=='[') stack.push(i);
            else if ((c == ')'||c=='}'||c==']') && !stack.isEmpty()) {
                start = stack.pop();
                end = i;
            }
        }

        if (start != -1 && end != -1) {
            System.out.println(s.substring(start, end + 1));
        } else {
            System.out.println("No balanced parentheses");
        }
        sc.close();
    }
}
