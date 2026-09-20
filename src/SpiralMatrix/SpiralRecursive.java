package SpiralMatrix;
import java.util.*;

public class SpiralRecursive {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        spiralRec(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1, res);
        return res;
    }

    private static void spiralRec(int[][] m, int top, int bottom, int left, int right, List<Integer> res) {
        if (top > bottom || left > right) return;

        // top row left->right
        for (int j = left; j <= right; j++) res.add(m[top][j]);

        // right column top+1 -> bottom
        for (int i = top + 1; i <= bottom; i++) res.add(m[i][right]);

        // bottom row right-1 -> left (only if there's another row)
        if (top < bottom) {
            for (int j = right - 1; j >= left; j--) res.add(m[bottom][j]);
        }

        // left column bottom-1 -> top+1 (only if there's another column)
        if (left < right) {
            for (int i = bottom - 1; i > top; i--) res.add(m[i][left]);
        }

        // recurse on the inner rectangle
        spiralRec(m, top + 1, bottom - 1, left + 1, right - 1, res);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println(spiralOrder(mat)); 
        // [1,2,3,4,8,12,11,10,9,5,6,7]
    }
}
