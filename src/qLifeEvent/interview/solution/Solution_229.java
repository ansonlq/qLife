package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/majority-element-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_229 {
    public List<Integer> majorityElement(final int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList<Integer>();
        }
        // how many numbers at most if more than 1/3
        int num1 = nums[0];
        int num2 = nums[0];

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) {
                count1++;
            } else if (nums[i] == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                num2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) {
                count1++;
            }

            if (nums[i] == num2) {
                count2++;
            }
        }

        final List<Integer> result = new ArrayList<Integer>();

        if (count1 > nums.length / 3) {
            result.add(num1);
        }

        if (count2 > nums.length / 3) {
            result.add(num2);
        }

        return null;
    }
}
