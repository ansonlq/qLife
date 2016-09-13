package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/house-robber/
 * 
 * @author ql030422
 * 
 */
public class Solution_198_DP {
    public int rob(final int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        final int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[1], nums[0]);

        for (int i = 2; i < nums.length; i++) {
            sum[i] = Math.max(sum[i - 1], nums[i] + sum[i - 2]);
        }
        return sum[nums.length - 1];
    }
}
