package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_2_9 {
    public int search(final int[] nums, final int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {
            final int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] < nums[mid]) {
                if (nums[start] < target && target < nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                if (nums[mid] < target && target < nums[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }

        if (nums[start] == target) {
            return start;
        }

        if (nums[end] == target) {
            return end;
        }

        return -1;
    }
}
