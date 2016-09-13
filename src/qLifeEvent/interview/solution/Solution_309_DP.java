package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * 
 * @author ql030422
 * 
 */
public class Solution_309_DP {
    public int maxProfit(final int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        final int[] dp = new int[prices.length];
        dp[0] = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] <= prices[i]) {
                dp[i] = dp[i - 1] + prices[i] - prices[i - 1];
                continue;
            } else if (i >= 2 && i < prices.length - 1 && prices[i] < prices[i + 1]) {
                dp[i] = Math.max(dp[i - 2] + prices[i + 1] - prices[i], dp[i - 1] + prices[i] - prices[i - 1]);
                dp[i + 1] = dp[i];
                i++;
                continue;
            }

            dp[i] = dp[i - 1];
        }
        return dp[prices.length - 1];
    }
}
