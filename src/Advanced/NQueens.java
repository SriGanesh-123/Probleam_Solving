package Advanced;
import java.util.*;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] cols = new int[n];
        place(0, cols, n, res);
        return res;
    }

    private static void place(int row, int[] cols, int n, List<List<String>> res) {
        if (row == n) {
            res.add(build(cols));
            return;
        }
        for (int c = 0; c < n; c++) {
            if (isValid(cols, row, c)) {
                cols[row] = c;
                place(row+1, cols, n, res);
            }
        }
    }

    private static boolean isValid(int[] cols, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (cols[i] == c) return false;
            if (Math.abs(cols[i] - c) == Math.abs(i - r)) return false;
        }
        return true;
    }

    private static List<String> build(int[] cols) {
        int n = cols.length;
        List<String> b = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[cols[r]] = 'Q';
            b.add(new String(row));
        }
        return b;
    }

    public static void main(String[] args) {
        List<List<String>> sol = solveNQueens(4);
        System.out.println("Solutions: " + sol.size());
        sol.forEach(l -> { l.forEach(System.out::println); System.out.println(); });
    }
}
