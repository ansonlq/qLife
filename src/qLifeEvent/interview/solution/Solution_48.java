package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/rotate-image/
 * 
 * @author ql030422
 * 
 */
public class Solution_48 {
    public void rotate(final int[][] matrix) {
        final int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - i - 1; j++) {
                final int temp = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp;
            }
        }
    }

    public void rotateClockwise(final int[][] matrix) {
        upSideDown(matrix);
        cornerSwap(matrix);
    }

    public void upSideDown(final int[][] matrix) {
        final int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                final int temp = matrix[i][j];
                matrix[i][j] = matrix[len - i - 1][j];
                matrix[len - i - 1][j] = temp;
            }
        }
    }

    public void cornerSwap(final int[][] matrix) {
        final int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                final int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverese(final int[][] matrix) {
        final int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                final int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - j - 1];
                matrix[i][len - j - 1] = temp;
            }
        }

    }

}
