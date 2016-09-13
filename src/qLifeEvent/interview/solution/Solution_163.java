package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/missing-ranges/
 * 
 * @author ql030422
 * 
 */
public class Solution_163 {
    public List<String> findMissingRanges(final int[] nums, final int lower, final int upper) {
        final List<String> result = new ArrayList<String>();

        for (int i = 0; i < nums.length; i++) {
            if (lower > nums[i]) {
                continue;
            }

        }

    }

    public String convert(final int start, final int end) {
        if (start == end) {
            return String.valueOf(start);
        }
        return String.valueOf(start) + "->" + String.valueOf(end);
    }
}
