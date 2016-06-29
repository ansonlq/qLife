package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/move-zeroes/
 * 
 * @author ql030422
 * 
 */
public class Solution_283 {
    public void moveZeroes(final int[] nums) {
        int zeroIndex = -1;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 0 && zeroIndex == -1) {
                zeroIndex = i;
            }

            if (nums[i] != 0 && zeroIndex != -1 && zeroIndex < i) {
                final int temp = nums[i];
                nums[i] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                zeroIndex++;
            }
        }
    }
}
