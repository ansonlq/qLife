package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/range-addition/
 * 
 * @author ql030422
 * 
 */
public class Solution_370 {

    public int[] getModifiedArrayNaive(final int length, final int[][] updates) {
        final int[] dashboard = initial(length);
        for (int rowNum = 0; rowNum < updates.length; rowNum++) {
            final int[] row = updates[rowNum];
            operate(dashboard, row);
        }
        return dashboard;
    }

    public int[] initial(final int length) {
        final int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = 0;
        }
        return result;
    }

    public void operate(final int[] dashboard, final int[] operation) {
        if (operation.length != 3) {
            return;
        }
        for (int i = operation[0]; i <= operation[1]; i++) {
            dashboard[i] += operation[2];
        }
    }

    /**
     * segment [i,j] is made of two parts [0,i-1] and [0, j] so [i,j] increase 2 is same as [0,j] increase 2 and [0,i-1]
     * increase -2. so you only need to update value at nums[j] with inc and nums[i-1] -inc. initially nums[i] is
     * defined as all elements [0,i] increases inc Backward!!!!
     * https://discuss.leetcode.com/topic/49674/java-o-n-k-time-o-1-space-with-algorithm-explained
     * 
     * @param length
     * @param updates
     * @return
     */
    public int[] getModifiedArray(final int length, final int[][] updates) {
        final int[] nums = new int[length];
        for (final int[] update : updates) {
            nums[update[1]] += update[2];
            if (update[0] > 0) {
                nums[update[0] - 1] -= update[2];
            }
        }

        int temp = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            temp = nums[i];
            nums[i - 1] += temp;
        }

        return nums;
    }
}
