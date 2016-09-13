package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_2_6 {
    public int findMin(final int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        final int target = nums[nums.length - 1];

        while (start + 1 < end) {
            final int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (nums[start] <= target) {
            return nums[start];
        } else {
            return nums[end];
        }

    }
}
