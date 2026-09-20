package Task;

import java.util.Scanner;

public class MinimumCharacterPalindrome {


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String : ");
    	
        String str = sc.nextLine();

        int removals = minDeletions(str);
        System.out.println("Minimum characters to remove: " + removals);
    }

    // Function to calculate minimum deletions
    public static int minDeletions(String s) {
        String rev = reverseString(s);  
        int lps = longestCommonSubsequence(s, rev);
        return s.length() - lps;
    }

   
    private static String reverseString(String s) {
        char[] arr = s.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i];   
        }
        return rev;
    }

    
    private static int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // match
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // not match
                }
            }
        }
        return dp[n][n];
    }
}