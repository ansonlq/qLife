package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/integer-break/
 * 
 * @author ql030422
 * 
 */
public class Solution_343_DP {
    public int integerBreak(final int n) {
        final int[] dp = new int[n + 1];
        if (n == 0 || n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        if (n == 3) {
            return 2;
        }

        if (n == 4) {
            return 4;
        }
        dp[4] = 4;

        if (n == 5) {
            return 6;
        }
        dp[5] = 6;

        if (n == 6) {
            return 9;
        }
        dp[6] = 9;

        for (int i = 7; i <= n; i++) {
            dp[i] = dp[i - 3] * 3;
        }

        return dp[n];
    }
}
