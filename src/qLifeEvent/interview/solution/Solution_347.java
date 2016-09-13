package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_347 {
    public List<Integer> topKFrequent(final int[] nums, final int k) {
        final List<Integer>[] bucket = new List[nums.length + 1];
        final Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (final int n : nums) {
            frequencyMap.put(n, frequencyMap.containsKey(n) ? frequencyMap.get(n) + 1 : 1);
        }

        for (final int key : frequencyMap.keySet()) {
            final int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<Integer>();
            }
            bucket[frequency].add(key);
        }

        final List<Integer> res = new ArrayList<Integer>();

        for (int pos = bucket.length - 1; pos >= 0 && res.size() <= k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }
}
