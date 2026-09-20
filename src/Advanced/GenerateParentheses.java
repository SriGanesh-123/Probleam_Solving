package Advanced;
import java.util.*;

public class GenerateParentheses {
    public static List<String> generate(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            res.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append('(');
            backtrack(res, cur, open+1, close, max);
            cur.deleteCharAt(cur.length()-1);
        }
        if (close < open) {
            cur.append(')');
            backtrack(res, cur, open, close+1, max);
            cur.deleteCharAt(cur.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generate(3)); // [((())), (()()), (())(), ()(()), ()()()]
    }
}
