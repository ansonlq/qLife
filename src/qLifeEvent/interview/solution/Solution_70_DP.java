package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * 
 * @author ql030422
 * 
 */
public class Solution_70_DP {
    public int climbStairs(final int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        final int[] stairs = new int[n];

        stairs[0] = 0;
        stairs[1] = 1;
        stairs[2] = 2;

        for (int i = 3; i < n; i++) {
            stairs[n] = stairs[n - 1] + stairs[n - 2];
        }

        return stairs[n - 1];
    }
}
