package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_121 {
    public int maxProfitMy(final int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int buy = prices[0];
        int buyIndex = 0;
        int sell = -1;
        int sellIndex = -1;
        int profit = 0;

        for (int i = 1; i <= prices.length - 1; i++) {

            if (prices[i] < buy) {
                buy = prices[i];
                buyIndex = i;

                if (buyIndex > sellIndex) {
                    sell = -1;
                    sellIndex = -1;
                }

            } else if (prices[i] >= sell) {
                sell = prices[i];
                sellIndex = i;
            }

            if (buyIndex < sellIndex && sell > buy) {
                final int tempProfit = sell - buy;
                if (tempProfit > profit) {
                    profit = tempProfit;
                }
            }
        }

        return profit;
    }

    public int maxProfit(final int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            final int temp = prices[i] - min;

            if (temp > profit) {
                profit = temp;
            }

        }
        return profit;
    }
}
