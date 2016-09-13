package qLifeEvent.interview.solution;

public class Solution_88 {
    public void mergeSpace(final int[] nums1, final int m, final int[] nums2, final int n) {
        final int[] taget = new int[m + n];
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < m + n; i++) {
            if (nums1[p1] < nums2[p2]) {
                taget[i] = nums1[p1];
                p1++;
            } else {
                taget[i] = nums2[p2];
                p2++;
            }

            if (p1 == m) {
                nums1[--p1] = Integer.MAX_VALUE;
            }

            if (p2 == n) {
                nums2[--p2] = Integer.MAX_VALUE;
            }
        }
    }

    public void merge(final int[] nums1, final int m, final int[] nums2, final int n) {
        int p1 = m;
        int p2 = n;

        for (int i = 0; i < m + n; i++) {

            if (nums1[p1 - i] <= nums2[p2 - i]) {
                nums1[m + n - 1 - i] = nums2[p2 - i];
                p2--;
            } else {
                nums1[m + n - 1 - i] = nums1[p1 - i];
                p1--;
            }

            if (p2 == 0) {
                break;
            }

        }

    }
}
