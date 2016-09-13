package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/wiggle-subsequence/
 * 
 * @author ql030422
 * 
 */
public class Solution_376 {

    public int wiggleMaxLength(final int[] nums) {

        if (nums == null) {
            return 0;
        }

        final Object[] objectNum = filterArray(nums);
        final int len = objectNum.length;
        if (len <= 1) {
            return len;
        }

        final int[] dp = new int[len];
        dp[0] = 0;
        dp[1] = 1;

        int preValue = 0;
        int value = 0;

        for (int i = 2; i < len; i++) {
            preValue = (Integer) objectNum[i - 1] - (Integer) objectNum[i - 2];
            value = (Integer) objectNum[i] - (Integer) objectNum[i - 1];

            if (value * preValue >= 0) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        return dp[len - 1] + 1;

    }

    public Object[] filterArray(final int[] nums) {

        if (nums.length == 0) {
            return new Object[0];
        }

        final int len = nums.length;
        final List<Integer> numList = new ArrayList<Integer>();
        numList.add(nums[0]);
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            numList.add(nums[i]);
        }
        return numList.toArray();
    }

    public int wiggleMaxLengthWrongUnderstanding(final int[] nums) {

        if (nums == null) {
            return 0;
        }

        if (nums.length <= 2) {
            return nums.length;
        }

        final int len = nums.length;
        final int[] dp = new int[len];
        int start = 0;
        int result = 0;

        for (int i = 1; i < len; i++) {
            final int value = nums[i] - nums[i - 1];
            dp[i] = value;
            // what if only 1?
            if (i == 1) {
                continue;
            }

            if (value > 0) {
                if (dp[i - 1] < 0) {
                    continue;
                } else {
                    result = Math.max(result, i - start);
                    start = i;
                }
            }

            if (value < 0) {
                if (dp[i - 1] > 0) {
                    continue;
                } else {
                    result = Math.max(result, i - start);
                    start = i;
                }
            }

            if (value == 0) {
                result = Math.max(result, i - start);
                start = i;
            }
        }
        return Math.max(result, nums.length - start);
    }
}
