package Number;
import java.util.*;

public class MaxSubarrayWithOneDeletion {
    public static int maxSumSubarray(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            // If only one element, we must remove it → result = 0
            return 0;
        }

        int[] fw = new int[n];  // forward max sum ending at i
        int[] bw = new int[n];  // backward max sum starting at i

        // Forward Kadane
        fw[0] = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < n; i++) {
            fw[i] = Math.max(arr[i], fw[i - 1] + arr[i]);
            maxSoFar = Math.max(maxSoFar, fw[i]);
        }

        // Backward Kadane
        bw[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            bw[i] = Math.max(arr[i], bw[i + 1] + arr[i]);
        }

        int ans = maxSoFar; // case: no deletion
        // Try deleting one element
        for (int i = 1; i < n - 1; i++) {
            ans = Math.max(ans, fw[i - 1] + bw[i + 1]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 3};
        System.out.println(maxSumSubarray(arr)); // Output: 4
    }
}