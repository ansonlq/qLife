package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 * 
 * @author ql030422
 * 
 */
public class Solution_54 {
    public List<Integer> spiralOrder(final int[][] matrix) {
        final List<Integer> result = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return result;
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return result;
    }

    public List<Integer> round(final int[][] matrix, final int rowStart, final int rowEnd, final int columnStart,
            final int columnEnd, final List<Integer> result) {

        if (rowEnd < rowStart || columnEnd < columnStart) {
            return result;
        }

        if (rowEnd == rowStart && columnEnd == columnStart) {
            result.add(matrix[rowStart][columnStart]);
            return result;
        }

        for (int i = columnStart; i < columnEnd; i++) {
            result.add(matrix[rowStart][i]);
        }

        for (int i = rowStart; i < rowEnd; i++) {
            result.add(matrix[i][columnEnd]);
        }

        for (int i = columnEnd; i > columnStart; i--) {
            result.add(matrix[rowEnd][i]);
        }

        for (int i = rowEnd; i > rowStart; i--) {
            result.add(matrix[i][columnStart]);
        }

        return round(matrix, rowStart + 1, rowEnd - 1, columnStart + 1, columnEnd - 1, result);
    }
}
