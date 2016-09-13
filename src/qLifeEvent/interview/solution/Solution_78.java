package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 * 
 * @author ql030422
 * 
 */
public class Solution_78 {
    public List<List<Integer>> subsets(final int[] nums) {
        final List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtracking(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    public void backtracking(final List<List<Integer>> resultList, final List<Integer> recordList, final int[] nums,
            final int start) {
        resultList.add(new ArrayList<Integer>(recordList));
        for (int i = start; i < nums.length; i++) {
            recordList.add(nums[i]);
            backtracking(resultList, recordList, nums, i + 1);
            recordList.remove(recordList.size() - 1);
        }
    }
}
