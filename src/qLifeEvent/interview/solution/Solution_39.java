package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/
 * 
 * @author ql030422
 * 
 */
public class Solution_39 {
    public List<List<Integer>> combinationSum(final int[] candidates, final int target) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        final List<Integer> record = new ArrayList<Integer>();
        output = recursive(candidates, target, output, record, 0);

        return output;
    }

    public List<List<Integer>> recursive(final int[] candidates, final int target, List<List<Integer>> output,
            final List<Integer> record, final int start) {
        if (target == 0) {
            output.add(new ArrayList<Integer>(record));
            return output;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            record.add(candidates[i]);
            final int value = target - candidates[i];
            output = recursive(candidates, value, output, record, i);
            record.remove(record.size() - 1);
        }
        return output;
    }
}
