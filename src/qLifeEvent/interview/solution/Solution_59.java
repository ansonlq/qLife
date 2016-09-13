package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/spiral-matrix-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_59 {
    public int[][] generateMatrix(final int n) {
        final int[][] matrix = new int[n][n];
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        int num = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = num++; // change
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++; // change
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                if (rowStart <= rowEnd) {
                    matrix[rowEnd][i] = num++; // change
                }
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                if (colStart <= colEnd) {
                    matrix[i][colStart] = num++; // change
                }
            }
            colStart++;
        }
        return matrix;
    }
}
