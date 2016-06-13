package qLifeEvent.interview.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * 
 * @author ql030422
 * 
 */
public class Solution_217 {
    public boolean containsDuplicate(final int[] nums) {
        final Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
