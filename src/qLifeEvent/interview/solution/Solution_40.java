package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_40 {
    public List<List<Integer>> combinationSum2(final int[] candidates, final int target) {
        final List<List<Integer>> output = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(output, new ArrayList<Integer>(), candidates, target, 0);
        return output;
    }

    public void backtrack(final List<List<Integer>> list, final List<Integer> tempList, final int[] candidates,
            final int remain, final int start) {

        if (remain < 0) {
            return;
        }

        if (remain == 0) {
            list.add(new ArrayList<Integer>(tempList));
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i - 1] == candidates[i]) {
                continue;
            }
            tempList.add(candidates[i]);
            backtrack(list, tempList, candidates, remain - candidates[i], i + 1);
            tempList.remove(tempList.size() - 1);
        }

    }
}
