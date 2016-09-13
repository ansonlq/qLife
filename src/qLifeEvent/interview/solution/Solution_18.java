package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/4sum/
 * 
 * @author ql030422
 * 
 */
public class Solution_18 {
    public List<List<Integer>> fourSum(final int[] nums, final int target) {
        final List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        final Set<List<Integer>> filterDuplicated = new HashSet<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            final int newTargetFirst = target - nums[i];

            for (int j = i + 1; j < nums.length - 1; j++) {
                // 需要最后一个for loop前创建HashMap
                final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
                final int newTargetSecond = newTargetFirst - nums[j];

                for (int k = j + 1; k < nums.length; k++) {
                    if (map.containsKey(nums[k])) {
                        final List<Integer> integerList = new ArrayList<Integer>();
                        final int index = map.get(nums[k]);
                        integerList.add(nums[i]);
                        integerList.add(nums[j]);
                        integerList.add(nums[index]);
                        integerList.add(nums[k]);
                        // 保证没有重复的位置的数字
                        // && isEqual(index, i, j, k)
                        if (!filterDuplicated.contains(integerList)) {
                            filterDuplicated.add(integerList);
                            resultList.add(integerList);
                        }
                    } else {
                        map.put(newTargetSecond - nums[k], k);
                    }
                }
            }
        }

        return resultList;
    }

    public boolean isEqual(final int index, final int i, final int j, final int k) {

        return index != i && index != j && index != k && i != j && i != k && j != k;

    }
}
