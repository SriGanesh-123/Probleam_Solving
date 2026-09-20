package SpiralMatrix;
import java.util.*;

public class SpiralCounterClockwise {
    public static List<Integer> spiralOrderAntiClockwise(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1) top -> bottom on left column (go down)
            for (int i = top; i <= bottom; i++) res.add(matrix[i][left]);
            left++;

            // 2) left -> right on bottom row
            if (left <= right) {
                for (int j = left; j <= right; j++) res.add(matrix[bottom][j]);
                bottom--;
            }

            // 3) bottom -> top on right column (go up)
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) res.add(matrix[i][right]);
                right--;
            }

            // 4) right -> left on top row
            if (left <= right) {
                for (int j = right; j >= left; j--) res.add(matrix[top][j]);
                top++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(spiralOrderAntiClockwise(mat));
        // Output: [1,4,7,8,9,6,3,2,5]
    }
}
