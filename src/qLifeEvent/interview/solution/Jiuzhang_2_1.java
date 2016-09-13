package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_2_1 {
    public int searchInsert(final int[] A, final int target) {

        if (A == null || A.length == 0) {
            return -1;
        }

        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            final int mid = start + (end - start) / 2;

            if (A[mid] == target) {
                return mid;
            }

            // ending state
            if (end - start <= 1) {
                if (A[start] > target) {
                    return start - 1;
                } else if (A[start] < target && A[end] > target) {
                    return start + 1;
                } else {
                    return end + 1;
                }

            }

            if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        return -1;

    }
}
