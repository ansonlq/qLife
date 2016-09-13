package qLifeEvent.interview.solution;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change/
 * 
 * @author ql030422
 * 
 */
public class Solution_322_DP {
    public int coinChange(final int[] coins, final int amount) {
        if (amount < 1) {
            return 0;
        }

        final int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (final int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
