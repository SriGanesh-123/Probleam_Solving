package SpiralMatrix;
import java.util.Arrays;

public class GenerateSpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {
            // left -> right (top row)
            for (int j = left; j <= right; j++) mat[top][j] = val++;
            top++;

            // top -> bottom (right column)
            for (int i = top; i <= bottom; i++) mat[i][right] = val++;
            right--;

            // right -> left (bottom row)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) mat[bottom][j] = val++;
                bottom--;
            }

            // bottom -> top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) mat[i][left] = val++;
                left++;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateMatrix(n);
        for (int[] row : result) System.out.println(Arrays.toString(row));
        // prints:
        // [1, 2, 3]
        // [8, 9, 4]
        // [7, 6, 5]
    }
}
