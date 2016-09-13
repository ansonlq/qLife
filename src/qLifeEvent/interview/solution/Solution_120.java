package qLifeEvent.interview.solution;

import java.util.List;

/**
 * https://leetcode.com/problems/triangle/
 * 
 * @author ql030422
 * 
 */
public class Solution_120 {

    public int minimumTotal(final List<List<Integer>> triangle) {
        final int[] dp = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

    // 贪心算法是不对的，要用DP来做, 无从上到下，还是从下到上，必须要用DP
    public int minimumTotalWrong(final List<List<Integer>> triangle) {
        int value = triangle.get(0).get(0);
        int preIndex = 0;
        for (int i = 1; i < triangle.size(); i++) {
            final List<Integer> targetList = triangle.get(i);
            if (targetList.get(preIndex) > targetList.get(preIndex + 1)) {
                value += targetList.get(preIndex + 1);
                preIndex = preIndex + 1;
            } else {
                value += targetList.get(preIndex);
            }
        }
        return value;
    }

    // [[2],[3,4],[6,5,7],[4,1,8,-10000]]
    public int minimumTotalDP(final List<List<Integer>> triangle) {
        final List<Integer> lastRow = triangle.get(triangle.size() - 1);
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < lastRow.size(); i++) {
            final int checkValue = pathValue(triangle, i);
            if (value > checkValue) {
                value = checkValue;
            }
        }
        return value;
    }

    public int pathValue(final List<List<Integer>> triangle, final int indexLast) {
        int value = triangle.get(triangle.size() - 1).get(indexLast);
        int preIndex = indexLast;
        for (int i = triangle.size() - 2; i >= 0; i--) {
            final List<Integer> targetList = triangle.get(i);

            if (preIndex == 0) {
                value += targetList.get(0);
                continue;
            }

            if (preIndex == targetList.size()) {
                value += targetList.get(targetList.size() - 1);
                preIndex = targetList.size() - 1;
                continue;
            }

            if (targetList.get(preIndex) > targetList.get(preIndex - 1)) {
                value += targetList.get(preIndex - 1);
                preIndex--;
            } else {
                value += targetList.get(preIndex);
            }
        }
        return value;
    }
}
