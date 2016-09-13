package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/strobogrammatic-number/
 * 
 * @author ql030422
 * 
 */
public class Solution_246 {
    public boolean isStrobogrammatic(final String num) {

        final char[] numCharArray = num.toCharArray();

        if (numCharArray.length < 1) {
            return false;
        }

        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(6, 9);
        map.put(9, 6);
        map.put(1, 1);
        map.put(8, 8);

        for (int i = 0; i < numCharArray.length / 2 + 1; i++) {

            if (!map.containsKey(numCharArray[i])) {
                return false;
            }

            if (numCharArray[numCharArray.length - 1 - i] != map.get(numCharArray[i])) {
                return false;
            }
        }
        return true;

    }
}
