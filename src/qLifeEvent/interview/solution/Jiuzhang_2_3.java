package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_2_3 {
    public int binarySearch(final int[] nums, final int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        if (nums[start] == target) {
            return start;
        }

        while (start + 1 < end) {
            final int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                for (int i = mid - 1; i > start; i--) {
                    if (nums[i] != target) {
                        return i + 1;
                    }
                }
            }
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (nums[end] == target) {
            return end;
        }

        return -1;
    }
}
