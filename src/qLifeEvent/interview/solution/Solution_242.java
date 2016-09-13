package qLifeEvent.interview.solution;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/
 * 
 * @author ql030422
 * 
 */
public class Solution_242 {
    public boolean isAnagram(final String s, final String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final char[] sChars = s.toCharArray();
        final char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        Arrays.sort(sChars);

        if (String.copyValueOf(tChars).equals(String.copyValueOf(sChars))) {
            return true;
        }
        return false;
    }
}
