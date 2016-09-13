package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/
 * 
 * @author ql030422
 * 
 */
public class Solution_96_DP_IMP {

    // another explaination:
    // https://discuss.leetcode.com/topic/37310/fantastic-clean-java-dp-solution-with-detail-explaination/2
    public int numTrees(final int n) {
        final int[] dp = new int[n + 1];
        if (n == 0 || n == 1) {
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        if (n < 3) {
            return dp[n];
        }

        for (int i = 3; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
}
