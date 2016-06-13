package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_219 {
    public boolean containsNearbyDuplicate(final int[] nums, final int k) {
        final Map<Integer, Integer> duplicateMap = new HashMap<Integer, Integer>();

        if (k < 1) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (duplicateMap.containsKey(nums[i])) {
                final int distance = i - duplicateMap.get(nums[i]);
                if (distance <= k) {
                    return true;
                } else {
                    duplicateMap.put(nums[i], i);
                }

                continue;
            }
            duplicateMap.put(nums[i], i);
        }

        return false;
    }
}
