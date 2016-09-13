package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_80 {

    public int removeDuplicates(final int[] nums) {
        int i = 0;
        for (final int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    public int removeDuplicatesMoreThanKTimes(final int[] nums, final int k) {
        // K<nums.length
        int i = 0;
        for (final int n : nums) {
            if (i < k || n > nums[i - k]) {
                nums[i++] = n;
            }
        }
        return i;

    }

}
