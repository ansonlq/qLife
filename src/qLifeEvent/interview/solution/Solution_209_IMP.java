package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * 
 * @author ql030422
 * 
 */
public class Solution_209_IMP {
    public int minSubArrayLen(final int s, final int[] nums) {
        int i = 1;
        int j = nums.length;
        int min = 0;
        while (i <= j) {
            final int midSize = (i + j) / 2;
            if (windowExist(midSize, nums, midSize)) {
                // 缩小范围
                j = midSize - 1;
                min = midSize;
            } else {
                // 扩大范围
                i = midSize + 1;
            }
        }
        return min;
    }

    private boolean windowExist(final int size, final int[] nums, final int s) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= size) {
                sum -= nums[i - size];
            }
            if (sum >= s) {
                return true;
            }
        }
        return false;
    }
}
