package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/ backtracking 算法
 * 
 * @author ql030422
 * 
 */
public class Solution_46 {
    public List<List<Integer>> permute(final int[] nums) {
        final List<List<Integer>> list = new ArrayList<List<Integer>>();
        final List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(nums);
        backtracking(list, temp, nums);
        return list;
    }

    public void backtracking(final List<List<Integer>> list, final List<Integer> temp, final int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<Integer>(temp));
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            backtracking(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
