package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/combination-sum-iv/
 * 
 * @author ql030422
 * 
 */
public class Solution_377 {
    public int combinationSum4(final int[] nums, int target) {
        if (target == 0 || nums.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }

        if (min < 0) {
            final int value = Math.abs(min);
            for (int i = 0; i < nums.length; i++) {
                nums[i] += value + 1;
            }
            target += value + 1;
        }

        final int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int j = 1; j <= target; j++) {
            for (int i = 0; i < nums.length; i++) {
                if ((j - nums[i]) < 0) {
                    dp[j] += 0;
                    continue;
                }
                dp[j] += dp[j - nums[i]];
            }
        }

        return dp[target];
    }
}
