package Array_String;
 import java.util.*;
 public class PalindromePairs {
    public static void main(String[] args) {
        String[] arr = {"bat","tab","cat"};
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    String combined = arr[i] + arr[j];
                    if (isPalindrome(combined)) {
                        result.add(new int[]{i, j});
                    }
                }
            }
        }
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }
    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
 }