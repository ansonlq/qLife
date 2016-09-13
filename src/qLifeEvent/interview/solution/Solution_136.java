package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/single-number/
 * 
 * @author ql030422
 * 
 */
public class Solution_136 {
    public int singleNumber(final int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            // 异或操作符，0^5=5 2^7=5
            result = result ^ nums[i];
        }
        return result;
    }
}
