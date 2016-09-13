package qLifeEvent.interview.solution;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-smaller/
 * 
 * @author ql030422
 * 
 */
public class Solution_259 {
    public int threeSumSmaller(final int[] nums, final int target) {
        int coutner = 0;

        if (nums == null || nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            final int newTarget = target - nums[i];
            int endIndex = nums.length - 1;
            int startIndex = i + 1;

            while (startIndex < endIndex) {
                if (nums[startIndex] + nums[endIndex] < newTarget) {
                    coutner += endIndex - startIndex;
                    startIndex++;
                } else {
                    endIndex--;
                }
            }
        }

        return coutner;
    }
}
