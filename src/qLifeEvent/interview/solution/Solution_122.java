package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_122 {
    public int maxProfitMy(final int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        boolean hold = false;
        int profit = 0;
        int buyPrice = Integer.MAX_VALUE;

        if (prices.length == 2) {
            if (prices[1] > prices[0]) {
                return prices[1] - prices[0];
            }
        }

        for (int i = 0; i <= prices.length - 2; i++) {
            if (hold) {
                if (prices[i + 1] < prices[i]) {
                    profit += prices[i] - buyPrice;
                    hold = false;
                    buyPrice = Integer.MAX_VALUE;
                }
            } else {
                if (prices[i + 1] > prices[i]) {
                    buyPrice = prices[i];
                    hold = true;
                }
            }
        }

        if (hold) {
            profit += prices[prices.length - 1] - buyPrice;
        }

        return profit;
    }

    public int maxProfit(final int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
