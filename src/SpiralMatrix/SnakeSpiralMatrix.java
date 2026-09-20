package SpiralMatrix;
import java.util.Arrays;

public class SnakeSpiralMatrix {
    public static int[][] generateSnakeSpiral(int n) {
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int val = 1;
        boolean horizontal = true; // start horizontal (left->right)
        
        while (top <= bottom && left <= right) {
            if (horizontal) {
                // left -> right on top row
                for (int j = left; j <= right; j++) mat[top][j] = val++;
                top++;
                
                // right -> left on bottom row
                if (top <= bottom) {
                    for (int j = right; j >= left; j--) mat[bottom][j] = val++;
                    bottom--;
                }
            } else {
                // top -> bottom on left column
                for (int i = top; i <= bottom; i++) mat[i][left] = val++;
                left++;
                
                // bottom -> top on right column
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) mat[i][right] = val++;
                    right--;
                }
            }
            horizontal = !horizontal; // alternate direction
        }
        return mat;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] result = generateSnakeSpiral(n);
        for (int[] row : result) System.out.println(Arrays.toString(row));
    }
}
