package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/unique-paths/
 * 
 * @author ql030422
 * 
 */
public class Solution_62 {
    public int uniquePaths(final int m, final int n) {
        final int[][] board = new int[m][n];
        board[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    board[i][j] = 1;
                    continue;
                }

                board[i][j] = board[i - 1][j] + board[i][j - 1];
            }
        }
        return board[m - 1][n - 1];
    }
}
