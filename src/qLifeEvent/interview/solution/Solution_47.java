package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_47 {
    public List<List<Integer>> permuteUnique(final int[] nums) {
        final List<List<Integer>> list = new ArrayList<List<Integer>>();
        final List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(nums);
        final boolean[] isUsed = new boolean[nums.length];
        backtracking(list, temp, nums, isUsed);
        return list;
    }

    public void backtracking(final List<List<Integer>> list, final List<Integer> temp, final int[] nums,
            final boolean[] isUsed) {
        // Base case
        if (temp.size() == nums.length) {
            list.add(new ArrayList<Integer>(temp));
        }

        // for loop
        for (int i = 0; i < nums.length; i++) {
            if (!isUsed[]||i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            backtracking(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
        // return
    }
}
