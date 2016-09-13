package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_2_10 {
    public int[] searchRange(final int[] nums, final int target) {

        if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int start = 0;
        int end = nums.length - 1;
        final int[] bound = new int[2];

        while (start + 1 < end) {
            final int mid = (end + start) / 2;
            start = mid;
            end = mid;
        }

        if (nums[start] == target) {
            return null;
        }

        if (nums[end] == target) {
            return null;
        }

    }
}
