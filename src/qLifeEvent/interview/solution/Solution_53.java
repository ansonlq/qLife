package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-subarray/
 * 
 * @author ql030422
 * 
 */
public class Solution_53 {

    public int maxSubArray(final int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        final int[] dpList = new int[nums.length];
        int max = Integer.MIN_VALUE;
        dpList[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dpList[i] = nums[i] + (dpList[i - 1] > 0 ? dpList[i - 1] : 0);
            max = Math.max(max, dpList[i]);
        }
        return max;
    }

    // Subprogram找的不对，应该是 dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
    public int maxSubArrayWrong(final int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        final int[] dpList = new int[nums.length];
        int value = 0;
        boolean flag = true;
        dpList[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            final Map<Integer, Integer> checkMap = new HashMap<Integer, Integer>();
            checkMap.put(nums[i], 0);

            final int temp = Math.max(nums[i], dpList[i - 1]);

            if (flag) {
                checkMap.put(nums[i] + dpList[i - 1], 0);
                checkMap.put(dpList[i - 1], dpList[i - 1] + nums[i]);
                dpList[i] = Math.max(nums[i] + dpList[i - 1], temp);
            } else {
                checkMap.put(value + nums[i], 0);
                checkMap.put(dpList[i - 1], value + nums[i]);
                dpList[i] = Math.max(temp, value + nums[i]);
            }

            value = checkMap.get(dpList[i]);

            if (value != 0) {
                flag = false;
            } else if (dpList[i] == dpList[i - 1]) {
                flag = false;
            } else {
                flag = true;
            }

            System.out.println("value: " + value);// [-2,1,-3,4,-1,2,1,-5,4]
        }

        return dpList[nums.length - 1];
    }
}
