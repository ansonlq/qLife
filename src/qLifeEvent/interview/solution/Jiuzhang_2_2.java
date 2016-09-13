package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_2_2 {
    public boolean searchMatrix(final int[][] matrix, final int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0 || target < matrix[0][0]) {
            return false;
        }

        int rowTarget = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            if (target >= matrix[i][0] && target < matrix[i + 1][0]) {
                rowTarget = i;
                break;
            }
            if (i + 1 == matrix.length - 1) {
                rowTarget = matrix.length - 1;
            }
        }

        int start = 0;
        int end = matrix[rowTarget].length - 1;

        if (matrix[rowTarget][start] == target) {
            return true;
        }

        if (matrix[rowTarget][end] == target) {
            return true;
        }

        while (start + 1 < end) {
            final int mid = start + (end - start) / 2;
            if (matrix[rowTarget][mid] == target) {
                return true;
            }
            if (matrix[rowTarget][mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return false;
    }
}
