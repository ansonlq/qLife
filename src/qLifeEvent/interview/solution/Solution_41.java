package qLifeEvent.interview.solution;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/first-missing-positive/
 * 
 * @author ql030422
 * 
 */
public class Solution_41 {
    public int firstMissingPositive(final int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            }

            if (nums[i] != start) {
                return start;
            }
            start++;
        }
        return start;
    }
}
