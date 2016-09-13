package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * @author ql030422
 * 
 */
public class Solution_26 {
    public int removeDuplicates(final int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length < 2) {
            return 2;
        }

        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
