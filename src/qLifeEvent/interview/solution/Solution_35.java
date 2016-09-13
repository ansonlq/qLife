package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/search-insert-position/
 * 
 * @author ql030422
 * 
 */
public class Solution_35 {
    public int searchInsert(final int[] nums, final int target) {
        final int len = nums.length;
        int start = 0;
        int end = len - 1;

        while (start < len) {
            final int mid = (start + end) / 2;

            if (start == mid || end == mid) {
                break;
            }

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid;
            }

            if (nums[mid] < target) {
                start = mid;
            }

        }

    }

    public int searchInsertNavie(final int[] nums, final int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
