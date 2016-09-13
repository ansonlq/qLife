package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
 * 
 * @author ql030422
 * 
 */
public class Solution_325_IMP {
    public int maxSubArrayLen(final int[] nums, final int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        final int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1); // add this fake entry to make sum from 0 to j consistent
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i] - k)) {
                max = Math.max(max, i - map.get(nums[i] - k));
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        return max;
    }
}
