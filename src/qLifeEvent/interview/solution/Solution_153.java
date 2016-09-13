package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * 
 * @author ql030422
 * 
 */
public class Solution_153 {
    public int findMinNaive(final int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }

        }
        return nums[0];
    }

    public int findMin(final int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            final int mid = (start + end) / 2;

            if (nums[mid] >= nums[end]) {
                start = mid + 1;
            }

            if (nums[mid] < nums[end]) {
                end = mid;
            }
        }
        return nums[start];
    }
}
