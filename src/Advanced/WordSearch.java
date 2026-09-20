package Advanced;
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j, used))
                    return true;
        return false;
    }

    private static boolean dfs(char[][] b, String w, int idx, int r, int c, boolean[][] used) {
        if (idx == w.length()) return true;
        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length || used[r][c] || b[r][c] != w.charAt(idx))
            return false;
        used[r][c] = true;
        boolean found = dfs(b, w, idx+1, r+1, c, used)
                     || dfs(b, w, idx+1, r-1, c, used)
                     || dfs(b, w, idx+1, r, c+1, used)
                     || dfs(b, w, idx+1, r, c-1, used);
        used[r][c] = false;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        System.out.println(exist(board, "ABCCED")); // true
        System.out.println(exist(board, "SEE")); // true
        System.out.println(exist(board, "ABCB")); // false
    }
}
