package qLifeEvent.interview.solution;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/
 * 
 * @author ql030422
 * 
 */
public class Solution_16 {
    public int threeSumClosest(final int[] nums, final int target) {
        int cloestValue = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        final int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            final int newTarget = target - nums[i];
            int start = i + 1;
            int end = len - 1;

            while (start < end) {
                final int temp = newTarget - nums[start] - nums[end];
                if (temp >= 0) {
                    start++;
                }

                if (temp < 0) {
                    end--;
                }

                if (cloestValue > Math.abs(temp)) {
                    cloestValue = Math.abs(temp);
                    result = target - temp;
                }
            }
        }

        return result;
    }
}
