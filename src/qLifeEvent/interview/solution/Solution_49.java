package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/anagrams/
 * 
 * @author ql030422
 * 
 */
public class Solution_49 {
    public List<List<String>> groupAnagrams(final String[] strs) {
        final List<List<String>> result = new ArrayList<List<String>>();
        final Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (final String str : strs) {
            final String key = convertKey(str);
            if (!map.containsKey(key)) {
                final List<String> list = new ArrayList<String>();
                map.put(key, list);
            }
            map.get(key).add(str);
        }

        for (final String key : map.keySet()) {
            final List<String> list = map.get(key);
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }

    public String convertKey(final String str) {
        final char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.copyValueOf(charArray);
    }

}
