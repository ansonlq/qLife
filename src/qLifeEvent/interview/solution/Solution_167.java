package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_167 {
    public int[] twoSum(final int[] numbers, final int target) {
        final int[] result = new int[2];

        if (numbers == null || numbers.length < 2) {
            return result;
        }

        final Map<Integer, Integer> recordMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (recordMap.containsKey(numbers[i])) {
                result[0] = recordMap.get(numbers[i]) + 1;
                result[1] = i + 1;
            }
            final int key = target - numbers[i];
            recordMap.put(key, i);
        }

        return result;
    }
}
