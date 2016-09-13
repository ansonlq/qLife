package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/minimum-path-sum/
 * 
 * @author ql030422
 * 
 */
public class Solution_64 {
    public int minPathSum(final int[][] grid) {

        if (grid == null || (grid.length == 0 && grid[0].length == 0)) {
            return 0;
        }

        final int row = grid.length;
        final int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                if (i == 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                    continue;
                }

                if (j == 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                    continue;
                }

                grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[row - 1][col - 1];
    }
}
