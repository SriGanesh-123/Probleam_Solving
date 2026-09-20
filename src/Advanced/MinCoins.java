package Advanced;
import java.util.Arrays;

public class MinCoins {
    public static int minCoins(int[] coins, int amount) {
        int INF = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (c <= i) dp[i] = Math.min(dp[i], 1 + dp[i - c]);
            }
        }
        return dp[amount] == INF ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(minCoins(new int[]{1,2,5}, 11)); // 3 (5+5+1)
        System.out.println(minCoins(new int[]{2}, 3)); // -1
    }
}
