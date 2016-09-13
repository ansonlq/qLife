package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-iii/
 * 
 * @author ql030422
 * 
 */
public class Solution_216 {
    public List<List<Integer>> combinationSum3(final int k, final int n) {
        final int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        final List<List<Integer>> result = new ArrayList<List<Integer>>();
        final List<Integer> tempList = new ArrayList<Integer>();
        backtracking(result, tempList, nums, n, 0, k);
        return result;
    }

    public void backtracking(final List<List<Integer>> result, final List<Integer> tempList, final int[] nums,
            final int target, final int start, final int k) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            if (tempList.size() == k) {
                result.add(new ArrayList<Integer>(tempList));
            }
            return;
        }

        if (tempList.size() >= k) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(result, tempList, nums, target - nums[i], i + 1, k);
            tempList.remove(tempList.size() - 1);
        }
    }
}
