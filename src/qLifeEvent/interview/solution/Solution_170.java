package qLifeEvent.interview.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/two-sum-iii-data-structure-design/
 * 
 * @author ql030422
 * 
 */
public class Solution_170 {
    private final Set<Integer> numSet;

    public Solution_170() {
        numSet = new HashSet<Integer>();
    }

    public void add(final int number) {
        for (final Integer num : numSet) {
            numSet.add(num + number);
        }
        numSet.add(number);
    }

    public boolean find(final int value) {
        return numSet.contains(value);
    }
}
