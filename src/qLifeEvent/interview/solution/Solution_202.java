package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 * 
 * @author ql030422
 * 
 */
public class Solution_202 {
    public boolean isHappy(final int n) {
        final Set<Integer> numSet = new HashSet<Integer>();

        int value = n;
        while (value != 1) {
            value = cal(value);
            if (numSet.contains(value)) {
                return false;
            }
            numSet.add(value);
        }
        return true;
    }

    public int cal(int num) {
        final List<Integer> numList = new ArrayList<Integer>();

        while (num != 0) {
            final int value = num % 10;
            numList.add(value);
            num = num / 10;
        }

        int result = 0;
        for (final int number : numList) {
            result += number * number;
        }

        return result;
    }
}
