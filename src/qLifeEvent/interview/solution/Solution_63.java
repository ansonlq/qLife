package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/unique-paths-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_63 {
    public int uniquePathsWithObstacles(final int[][] obstacleGrid) {

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        final int[][] board = new int[obstacleGrid.length][obstacleGrid[0].length];
        board[0][0] = 1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (obstacleGrid[i][j] == 1) {
                    board[i][j] = 0;
                    continue;
                }

                if (i == 0 && j == 0) {
                    continue;
                }

                if (i == 0 && j != 0) {
                    board[i][j] = board[i][j - 1];
                    continue;
                }

                if (i != 0 && j == 0) {
                    board[i][j] = board[i - 1][j];
                    continue;
                }

                board[i][j] = board[i - 1][j] + board[i][j - 1];
            }
        }
        return board[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
