package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/range-sum-query-2d-immutable/
 * 
 * @author ql030422
 * 
 */
public class Solution_304_DP {

    int[][] recordMatrix;

    public Solution_304_DP(final int[][] matrix) {
        final int row = matrix.length;
        final int col = matrix[0].length;
        recordMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; i < col; j++) {
                if (j == 0) {
                    recordMatrix[i][j] = matrix[i][j];
                }
                recordMatrix[i][j] = recordMatrix[i][j - 1] + matrix[i][j];
            }
        }

    }

    public int sumRegion(final int row1, final int col1, final int row2, final int col2) {
        int result = 0;
        for (int i = row1; i < row2; i++) {
            result += (recordMatrix[i][col2] - recordMatrix[i][col1]);
        }
        return result;
    }
}
