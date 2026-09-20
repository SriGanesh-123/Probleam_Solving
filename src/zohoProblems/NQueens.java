package zohoProblems;
public class NQueens {
    public static void solveNQueens(int n) {
        int[] board = new int[n];
        placeQueens(board, 0);
    }

    public static void placeQueens(int[] board, int row) {
        int n = board.length;
        if (row == n) {
            printBoard(board);
            return;
        }
        for (int col = 0; col < n; col++) {
            board[row] = col;
            if (isSafe(board, row)) placeQueens(board, row + 1);
        }
    }

    public static boolean isSafe(int[] board, int row) {
        for (int i = 0; i < row; i++) {
            if (board[i] == board[row] || Math.abs(board[i] - board[row]) == row - i)
                return false;
        }
        return true;
    }

    public static void printBoard(int[] board) {
        for (int row : board) {
            for (int i = 0; i < board.length; i++)
                System.out.print((i == row ? "Q " : ". "));
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solveNQueens(4);
    }
}
