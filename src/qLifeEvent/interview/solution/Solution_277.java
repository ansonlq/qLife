package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/find-the-celebrity/
 * 
 * @author ql030422
 * 
 */
public class Solution_277 {
    public int findCelebrity(final int n) {
        int cele = 0;
        for (int i = 0; i < n - 1; i++) {
            if (knows(i, i + 1)) {
                cele = i + 1;
            }
        }

        if (cele == 0 && !knows(1, 0)) {
            return -1;
        }

        if (!knows(1, cele)) {
            return -1;
        }

        return cele;
    }
}
