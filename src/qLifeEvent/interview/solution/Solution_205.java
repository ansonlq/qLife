package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 * 
 * @author ql030422
 * 
 */
public class Solution_205 {

    public boolean isIsomorphic(final String s1, final String s2) {
        final Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        final Map<Character, Integer> m2 = new HashMap<Character, Integer>();

        for (Integer i = 0; i < s1.length(); i++) {

            if (m1.put(s1.charAt(i), i) != m2.put(s2.charAt(i), i)) {
                return false;
            }
        }
        return true;

    }

    // 超时了
    public boolean isIsomorphicNavie(final String s, final String t) {

        if (s.length() != t.length()) {
            return false;
        }

        final Map<String, Integer> sMap = new HashMap<String, Integer>();
        final Map<String, Integer> tMap = new HashMap<String, Integer>();

        String sString = "";
        String tString = "";

        for (int i = 0; i < s.length(); i++) {
            final char sChar = s.charAt(i);
            final String sTemp = String.valueOf(sChar);
            if (sMap.containsKey(sTemp)) {
                sString += sMap.get(sTemp);
            } else {
                sMap.put(sTemp, i);
                sString += i;
            }
        }

        for (int i = 0; i < t.length(); i++) {
            final char tChar = t.charAt(i);
            final String tTemp = String.valueOf(tChar);
            if (tMap.containsKey(tTemp)) {
                tString += tMap.get(tTemp);
            } else {
                tMap.put(tTemp, i);
                tString += i;
            }
        }

        return sString.equals(tString);
    }
}
