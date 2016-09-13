package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/rotate-array/
 * 
 * @author ql030422
 * 
 */
public class Solution_189 {
    public void rotate(final int[] nums, final int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(final int[] nums, int start, int end) {
        while (start < end) {
            final int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
