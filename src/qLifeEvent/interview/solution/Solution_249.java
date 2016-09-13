package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_249 {
    public List<List<String>> groupStrings(final String[] strings) {
        final List<List<String>> result = new ArrayList<List<String>>();
        final Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (final String str : strings) {
            final int offset = str.charAt(0) - 'a';
            String key = "";
            for (int i = 0; i < str.length(); i++) {
                char c = (char) (str.charAt(i) - offset);
                if (c < 'a') {
                    c += 26;
                }
                key += c;
            }
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
}
