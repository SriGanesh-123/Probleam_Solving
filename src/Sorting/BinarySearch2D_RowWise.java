package Sorting;

public class BinarySearch2D_RowWise {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int key = 30;
        int result[] = searchMatrix(arr, key);

        if (result[0] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + key + " found at (" + result[0] + ", " + result[1] + ")");
        }
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{-1, -1}; // not found
    }
}
