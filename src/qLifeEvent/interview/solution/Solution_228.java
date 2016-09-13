package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/summary-ranges/
 * 
 * @author ql030422
 * 
 */
public class Solution_228 {
    public List<String> summaryRanges(final int[] nums) {
        final List<String> result = new ArrayList<String>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0];
        int end = start;

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length) {
                result.add(convert(start, end));
                continue;
            }

            if (nums[i] - nums[i - 1] != 1) {
                result.add(convert(start, end));
                start = nums[i];
                end = start;
            }

            end = nums[i];
        }

        return result;
    }

    public String convert(final int start, final int end) {

        if (start == end) {
            return String.valueOf(start);
        }

        return String.valueOf(start) + "->" + String.valueOf(end);

    }
}
