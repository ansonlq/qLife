package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * 
 * @author ql030422
 * 
 */
public class Solution_42 {
    public int trap(final int[] height) {
        if (height.length <= 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }

        int leftMax = height[0];
        int water = 0;
        for (int i = 1; i < maxIndex; i++) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            } else {
                water += leftMax - height[i];
            }
        }

        int rightMax = height[height.length - 1];
        for (int i = height.length - 2; i > maxIndex; i--) {
            if (height[i] > rightMax) {
                rightMax = height[i];
            } else {
                water += rightMax - height[i];
            }
        }

        return water;
    }

    public int waterAmount(final int[] heights, final int start, final int end) {
        final int lowestHeight = Math.min(heights[start], heights[end]);
        int waterAmount = 0;
        for (int i = start + 1; i < end; i++) {
            final int temp = lowestHeight - heights[i];
            if (temp > 0) {
                waterAmount += temp;
            }
        }
        return waterAmount;
    }
}
