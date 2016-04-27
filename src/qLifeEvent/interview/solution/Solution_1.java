package qLifeEvent.interview.solution;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * 
 * @author ql030422
 * 
 */
public class Solution_1 {
    public int[] twoSum(final int[] nums, final int target) {
        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        final int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            final int t = target - nums[i];
            if (map.get(nums[i]) == null) {
                map.put(t, i);
            } else {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
        }
        return result;
    }
}
