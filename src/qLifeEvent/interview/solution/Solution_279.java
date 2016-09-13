package qLifeEvent.interview.solution;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/perfect-squares/
 * 
 * @author ql030422
 * 
 */
public class Solution_279 {
    public int numSquares(final int n) {
        int count = 1;
        int check = -1;
        while (check < n) {
            check = count * count;
            count++;
        }

        final int[] dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < n; j++) {
                if ((j - i * i) < 0) {
                    continue;
                }

                if (dp[j - i * i] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j - i * i], dp[j]) + 1;
                }
            }
        }
        return dp[n];

    }
}
