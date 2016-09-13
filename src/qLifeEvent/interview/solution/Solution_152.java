package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_152 {
    public int maxProduct(final int[] nums) {

        if (nums.length < 1) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int min = nums[0];
        int max = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            final int temp = max;
            max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
            min = Math.min(Math.min(nums[i] * temp, nums[i] * min), nums[i]);

            if (max > result) {
                result = max;
            }
        }

        return result;
    }
}
