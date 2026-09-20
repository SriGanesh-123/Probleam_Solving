package Task;
//9. Coin Change (DP)
//   Problem:
//   Given coins of different denominations and a target amount, find the minimum number of coins needed. If not possible, return -1.
//   Input: coins = \[1, 2, 5], amount = 11
//   Output: 3   (11 = 5 + 5 + 1)
//
//Java Code:
//
//```java
import java.util.*;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}

