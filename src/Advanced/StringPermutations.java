package Advanced;
import java.util.*;

public class StringPermutations {
    public static List<String> permute(String s) {
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        StringBuilder cur = new StringBuilder();
        backtrack(arr, used, cur, res);
        return res;
    }

    private static void backtrack(char[] arr, boolean[] used, StringBuilder cur, List<String> res) {
        if (cur.length() == arr.length) {
            res.add(cur.toString());
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            if (i > 0 && arr[i] == arr[i-1] && !used[i-1]) continue; // skip duplicates
            used[i] = true;
            cur.append(arr[i]);
            backtrack(arr, used, cur, res);
            cur.deleteCharAt(cur.length()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(permute("aba")); // [aab, aba, baa]
    }
}
