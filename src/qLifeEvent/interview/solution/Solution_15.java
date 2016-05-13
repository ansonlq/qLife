package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/3sum/
 * 
 * @author ql030422
 * 
 */
public class Solution_15 {

    public List<List<Integer>> threeSumNavie(final int[] nums) {
        final List<List<Integer>> resultList = new ArrayList<List<Integer>>(3);
        Arrays.sort(nums);
        final Set<List<Integer>> duplicated = new HashSet<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        final List<Integer> integerList = new ArrayList<Integer>(3);
                        integerList.add(nums[i]);
                        integerList.add(nums[j]);
                        integerList.add(nums[k]);
                        if (!duplicated.contains(integerList)) {
                            resultList.add(integerList);
                            duplicated.add(integerList);
                        }
                    }
                }
            }
        }

        return resultList;
    }

    public List<List<Integer>> threeSum(final int[] nums) {
        final List<List<Integer>> resultList = new ArrayList<List<Integer>>(3);
        final Set<List<Integer>> filterDuplicated = new HashSet<List<Integer>>();

        if (nums.length < 3) {
            return null;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }

                if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }

                if (nums[i] + nums[j] + nums[k] == 0 && i != j && j != k && i != k) {
                    final List<Integer> integerList = new ArrayList<Integer>(3);
                    integerList.add(nums[i]);
                    System.out.println("Position: " + i + " Value: " + nums[i]);
                    System.out.println("Position: " + j + " Value: " + nums[j]);
                    System.out.println("Position: " + k + " Value: " + nums[k]);
                    integerList.add(nums[j]);
                    integerList.add(nums[k]);
                    if (!filterDuplicated.contains(integerList)) {
                        filterDuplicated.add(integerList);
                        resultList.add(integerList);
                    }
                    j++;
                    k--;
                }
            }
        }

        return resultList;
    }

}
