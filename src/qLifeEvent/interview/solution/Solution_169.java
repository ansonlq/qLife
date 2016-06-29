package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/ Given an array of size n, find the majority element. The majority
 * element is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * @author ql030422
 * 
 */
public class Solution_169 {
    public int majorityElement(final int[] nums) {
        final Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (elementMap.containsKey(nums[i])) {
                int value = elementMap.get(nums[i]);
                elementMap.put(nums[i], ++value);
            } else {
                elementMap.put(nums[i], 1);
            }

            if (elementMap.get(nums[i]) > (nums.length / 2)) {
                return nums[i];
            }
        }
        return -1;
    }

    public int majorityElementBetter(final int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 1;
        int major = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != major) {
                count--;
            } else {
                count++;
            }
            if (count == 0) {
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }
}
