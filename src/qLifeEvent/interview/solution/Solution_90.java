package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_90 {
    public List<List<Integer>> subsetsWithDup(final int[] nums) {
        final List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);// 因为 nums[i] == nums[i - 1] 所以一定要sort
        backtracking(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    public void backtracking(final List<List<Integer>> list, final List<Integer> temp, final int[] nums, final int start) {
        list.add(new ArrayList<Integer>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            backtracking(list, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
