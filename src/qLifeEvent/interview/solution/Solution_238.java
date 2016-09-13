package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 * 
 * @author ql030422
 * 
 */
public class Solution_238 {
    public int[] productExceptSelf(final int[] nums) {
        final int len = nums.length;
        final int[] result = new int[len];
        result[0] = 1;
        for (int i = 1; i < len; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        final int[] temp = new int[len];
        temp[len - 1] = 1;

        for (int j = len - 1; j > 0; j--) {
            temp[j - 1] = temp[j] * nums[j];
            result[j - 1] *= temp[j - 1];
        }
        return result;
    }
}
